items_module.controller('ItemsController',
                          ['$scope', '$location', '$window', 'toastr', 'AppService', 'EnvService', 'NamespaceService',
                           'AppUtil',
                           function ($scope, $location, $window, toastr, AppService, EnvService, NamespaceService,
                                     AppUtil) {

                               var params = AppUtil.parseParams($location.$$url);
                               $scope.appId = params.appid;

                               $scope.step = 1;

                               $scope.submitBtnDisabled = false;

                               EnvService.find_all_envs().then(function (result) {
                                   $scope.envs = [];
                                   result.forEach(function (env) {
                                       $scope.envs.push({name: env, checked: false});

                                   });
                                   $(".apollo-container").removeClass("hidden");
                               }, function (result) {
                                   toastr.error(AppUtil.errorMsg(result), "加载环境信息出错");
                               });

                               $scope.clusterName = '';
                               $scope.unray = true;

                               var publicOpType = [{"id": "-1", "text": "请选择"}, {"id": "aam", "text": "修改+新增"}, {"id": "del", "text": "删除"}, {"id": "main_release", "text": "批量发布"}];
                               $('#opType').select2({
                                   placeholder: '请选择操作类型',
                                   width: '100%',
                                   data: publicOpType
                               }).val("-1").trigger('change');

                               $("#opType").val("-1").trigger("change");

                               $("#opType").on("select2:select",function(){
                                   var data = $(this).val();
                                   if(data=="main_release"){
                                       $scope.unray = false
                                   }else{
                                       $scope.unray = true
                                   }
                                   console.log(data)
                               });

                               $scope.switchChecked = function (env,  $event) {
                                   env.checked = !env.checked;
                                   $event.stopPropagation();
                               };

                               $scope.toggleEnvCheckedStatus = function (env) {
                                   env.checked = !env.checked;
                               };

                               var selectedClusters = [];
                               $scope.collectSelectedClusters = function (data) {
                                   selectedClusters = data;
                               };

                               $scope.create = function () {
                                   console.log('-------------------')

                                   if (selectedClusters.length <= 0){
                                       toastr.warning("请选择环境及集群");
                                       return
                                   }

                                   $scope.submitBtnDisabled = true;
                                   console.log($scope.NamespaceArea)
                                   console.log($scope.itemArea)
                                   console.log($scope.appId)
                                   console.log(selectedClusters)
                                   console.log($scope.opType)

                                   var namespaceBatchModel = [];
                                   selectedClusters.forEach(function (cluster) {
                                       namespaceBatchModel.push({
                                           env: cluster.env,
                                           namespace: {
                                               appId: $scope.appId,
                                               NamespaceArea: $scope.NamespaceArea,
                                               itemArea: $scope.itemArea,
                                               clusterName: cluster.clusterName,
                                               itemComment: $scope.itemComment,
                                               opType: $("#opType").val()
                                           }
                                       });
                                   });

                                   NamespaceService.batchWriteAndUpdateNamespaces($scope.appId, namespaceBatchModel)
                                       .then(function (result) {
                                           toastr.success("操作成功");
                                           $scope.step = 2;
                                           // setInterval(function () {
                                           //     $scope.submitBtnDisabled = false;
                                           //     $window.location.href =
                                           //         '/namespace/role.html?#appid=' + $scope.appId
                                           //         + "&namespaceName=" + $scope.namespaceName;
                                           // }, 1000);
                                       }, function (result) {
                                           $scope.submitBtnDisabled = false;
                                           toastr.error(AppUtil.errorMsg(result));
                                       });

                               };

                           }]);
