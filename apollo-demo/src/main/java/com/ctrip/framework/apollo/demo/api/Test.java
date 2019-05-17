package com.ctrip.framework.apollo.demo.api;

/**
 * Package: com.ctrip.framework.apollo.demo.api
 * User: 于淼
 * Email: yumiao3@jd.com
 * Date: 2019/5/17
 * Time: 下午2:10
 * Description:
 */
public class Test {
    public static void main(String[] args){
        String s ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<allocations>\n" +
                "    <queue name=\"root\">\n" +
                "        <aclSubmitApps> </aclSubmitApps>\n" +
                "        <aclAdministerApps> </aclAdministerApps>\n" +
                "        <maxRunningApps>2003</maxRunningApps>\n" +
                "        <schedulingPolicy>fair</schedulingPolicy>\n" +
                "        <queue name=\"default\">\n" +
                "            <minResources>5728640  mb,3000  vcores,0 gcores</minResources>\n" +
                "            <maxResources>5728640  mb,103000  vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>11</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>yarn</aclSubmitApps>\n" +
                "            <aclAdministerApps>*</aclAdministerApps>\n" +
                "            <accessibleLabels>DEFAULT,DOCKER_IMAGE_TEST</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"default\">\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_dd_edw\">\n" +
                "            <minResources>251016000 mb,189600 vcores,0 gcores</minResources>\n" +
                "            <maxResources>314719200 mb,239701 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>600</maxRunningApps>\n" +
                "            <weight>1.3</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw_read,dd_edw,dd_edw_test</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw_read,dd_edw,dd_edw_test</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <queue name=\"bdp_jdw_corejob\">\n" +
                "            <minResources>557344000 mb,100000 vcores,0 gcores</minResources>\n" +
                "            <maxResources>557344001 mb,100000 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>700</maxRunningApps>\n" +
                "            <weight>10000.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw</aclAdministerApps>\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <queue name=\"bdp_jdw_noncore\">\n" +
                "            <minResources>154688000 mb,60000 vcores,0 gcores</minResources>\n" +
                "            <maxResources>205625600 mb,100000 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "            <weight>1.8</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"dd_edw\">\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_dd_edw_test\">\n" +
                "            <minResources>38812800  mb,13924 vcores,0 gcores</minResources>\n" +
                "            <maxResources>206438400 mb,56772 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "            <weight>0.8</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw_test</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw_test</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"dd_edw_test\">\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_dd_sdm_union\">\n" +
                "            <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "            <maxResources>573440 mb,45770 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>9</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_sdm</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_sdm</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jdw_dd_sdm_safety\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>573440 mb,45770 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>dd_sdm</aclSubmitApps>\n" +
                "                <aclAdministerApps>dd_sdm</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jdw_dd_sdm_formal\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>573440 mb,45770 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>dd_sdm</aclSubmitApps>\n" +
                "                <aclAdministerApps>dd_sdm</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"dd_sdm\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_cmo_union\">\n" +
                "            <minResources>161100434 mb,161627 vcores,0 gcores</minResources>\n" +
                "            <maxResources>261805480 mb,197288 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>1</maxRunningApps>\n" +
                "            <weight>10.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_cmo,bds_dd,bds_dp,bds_dwm,bds_ol,bds_oo,bu_3c,bu_3c_dn,bu_3c_shlx,bu_3c_xt,bu_xtl,cmo_dkh,cmo_pt,sc_yf,mart_cmo_ad,bu_3c_tx</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_cmo_dev\">\n" +
                "                <minResources>161616530 mb,161877 vcores,0 gcores</minResources>\n" +
                "                <maxResources>225450366 mb,167588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>1000</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_formal\">\n" +
                "                <minResources>161616530 mb,161877 vcores,0 gcores</minResources>\n" +
                "                <maxResources>225450366 mb,167588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>300</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo mart_cmo,bds_dd,bds_dp,bds_dwm,bds_ol,bds_oo,bu_3c_xt</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_ide\">\n" +
                "                <minResources>81616530 mb,161877 vcores,0 gcores</minResources>\n" +
                "                <maxResources>127750366 mb,187588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>120</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_kylin\">\n" +
                "                <minResources>161616530 mb,161877 vcores,0 gcores</minResources>\n" +
                "                <maxResources>225450366 mb,167588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>10</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_bu\">\n" +
                "                <minResources>161616530 mb,161877 vcores,0 gcores</minResources>\n" +
                "                <maxResources>225450366 mb,167588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>80</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo,bu_3c,bu_3c_dn,bu_3c_shlx,bu_3c_xt,bu_xtl,cmo_dkh,cmo_pt,bu_3c_tx,bu_jjsh,bu_paipai,bu_3c_ts,bu_dfs,bu_xfp,bu_3c_sm,bu_dkx,bu_jd,bu_3c_cx,bu_sx,bu_all,bu_toplife,bu_3c_gyl</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_scyf\">\n" +
                "                <minResources>161616530 mb,161877 vcores,0 gcores</minResources>\n" +
                "                <maxResources>225450366 mb,167588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>10</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo,sc_yf</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_core\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <minResources>161616530 mb,161877  vcores,0 gcores</minResources>\n" +
                "                <maxResources>225450366 mb,167588 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>20</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_mkt\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>102400 mb,50 vcores,0 gcores</minResources>\n" +
                "                <maxResources>15728640 mb,3000 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>11</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_cmo\">\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_pop_union\">\n" +
                "            <minResources>24756224 mb,9120 vcores,0 gcores</minResources>\n" +
                "            <maxResources>50494477 mb,9652 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_pop</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_pop</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_pop_dev\">\n" +
                "                <minResources>24756224 mb,9120 vcores,0 gcores</minResources>\n" +
                "                <maxResources>50494477 mb,9652 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_pop</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_pop</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_pop_formal\">\n" +
                "                <minResources>24756224 mb,9120 vcores,0 gcores</minResources>\n" +
                "                <maxResources>50494477 mb,9652 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_pop</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_pop</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_pop\">\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_cfo_union\">\n" +
                "            <minResources>99923456  mb,31716 vcores,0 gcores</minResources>\n" +
                "            <maxResources>119908147  mb,38059   vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "            <weight>2.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_cfo</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_cfo_formal\">\n" +
                "                <minResources>88675840 mb,27175 vcores,0 gcores</minResources>\n" +
                "                <maxResources>90772992 mb,27817 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>300</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cfo_develop,mart_cfo_business,mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cfo_ide_sys,mart_cfo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cfo_presto\">\n" +
                "                <minResources>105929216 mb,32928 vcores,0 gcores</minResources>\n" +
                "                <maxResources>137126042 mb,36796 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>20</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cfo_develop,mart_cfo_business,mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cfo_ide_sys,mart_cfo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cfo_presto_nkhg\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>0</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cfo_develop,mart_cfo_business,mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cfo_ide_sys,mart_cfo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cfo_nkhg\">\n" +
                "                <minResources>41943040 mb,12853 vcores,0 gcores</minResources>\n" +
                "                <maxResources>51943040 mb,16853 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>50</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cfo_develop,mart_cfo_business,mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cfo_ide_sys,mart_cfo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cfo_spark\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <minResources>21247615 mb,7000 vcores,0 gcores</minResources>\n" +
                "                <maxResources>21247616 mb,7000 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>50</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cfo_develop,mart_cfo_business,mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cfo_ide_sys,mart_cfo</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_cfo\">\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_jrdw\">\n" +
                "            <minResources>73440 mb,8000 vcores,0 gcores</minResources>\n" +
                "            <maxResources>573440 mb,45770 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>jrdw</aclSubmitApps>\n" +
                "            <aclAdministerApps>jrdw</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"jrdw\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_cmo_ipc_union\">\n" +
                "            <minResources>118560768  mb,22494 vcores,0 gcores</minResources>\n" +
                "            <maxResources>142272922 mb,26993 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>400</maxRunningApps>\n" +
                "            <weight>2.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>bdp_jmart_ipc_formal ,cmo_ipc</aclSubmitApps>\n" +
                "            <aclAdministerApps>bdp_jmart_ipc_formal ,cmo_ipc</aclAdministerApps>\n" +
                "            <accessibleLabels>DEFAULT,CGROUP</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_ipc_formal\">\n" +
                "                <minResources>101702143  mb,22494vcores,0 gcores</minResources>\n" +
                "                <maxResources>137126042  mb,26796 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>bdp_jmart_ipc_formal ,cmo_ipc</aclSubmitApps>\n" +
                "                <aclAdministerApps>bdp_jmart_ipc_formal ,cmo_ipc</aclAdministerApps>\n" +
                "                <accessibleLabels>DEFAULT,CGROUP</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_ipc_dev\">\n" +
                "                <minResources>101446143  mb,22494 vcores,0 gcores</minResources>\n" +
                "                <maxResources>132818842 mb,28736 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>cmo_ipc_ide_sys,cmo_ipc</aclSubmitApps>\n" +
                "                <aclAdministerApps>cmo_ipc_ide_sys,cmo_ipc</aclAdministerApps>\n" +
                "                <accessibleLabels>DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_ipc_spark\">\n" +
                "                <minResources>101702143  mb,22494 vcores,0 gcores</minResources>\n" +
                "                <maxResources>137126042  mb,36796 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>cmo_ipc_ide_sys,cmo_ipc</aclSubmitApps>\n" +
                "                <aclAdministerApps>cmo_ipc_ide_sys,cmo_ipc</aclAdministerApps>\n" +
                "                <accessibleLabels>DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"cmo_ipc\">\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_audit_union\">\n" +
                "            <minResources>52469760 mb,15116 vcores,0 gcores</minResources>\n" +
                "            <maxResources>62963712 mb,18139 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_audit_ide_sys,mart_audit</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_audit_ide_sys,mart_audit</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_audit_ide\">\n" +
                "                <minResources>35782666 mb,12012 vcores,0 gcores</minResources>\n" +
                "                <maxResources>42767155 mb,55632 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>50</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_audit_ide_sys,mart_audit</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_audit_ide_sys,mart_audit</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_audit_formal\">\n" +
                "                <minResources>35782666 mb,12012 vcores,0 gcores</minResources>\n" +
                "                <maxResources>42767155 mb,55632 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>150</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_audit_ide_sys,mart_audit</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_audit_ide_sys,mart_audit</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_audit\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_presto_union\">\n" +
                "            <minResources>12615181 mb,3720 vcores,0 gcores</minResources>\n" +
                "            <maxResources>32831400 mb,47314 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>21</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>*</aclSubmitApps>\n" +
                "            <aclAdministerApps>*</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT,MART_VDP___ALLUXIO,MART_CMO___PRESTO,MART_CMO_MKT___ALLUXIO,10K_MART_COM___BIEE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_cfo_presto\">\n" +
                "                <minResources>5188096 mb,2500 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cfo_develop,mart_cfo_ide_sys,mart_cfo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cfo_ide_sys,mart_cfo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cd_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cd</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cd</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_vdp_presto\">\n" +
                "                <minResources>1248256 mb,720 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_vdp_ide_sys,mart_vdp</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_vdp_ide_sys,mart_vdp</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_jrdw_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>jrdw</aclSubmitApps>\n" +
                "                <aclAdministerApps>jrdw</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_bda_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0  mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_bda</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_bda</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_recsys_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>recsys</aclSubmitApps>\n" +
                "                <aclAdministerApps>recsys</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cis_presto\">\n" +
                "                <minResources>1156096 mb,1250 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cis_ofc,mart_cis_block_chain,mart_cis</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cis</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_ibg_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_ibg</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_ibg</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_presto\">\n" +
                "                <minResources>626176 mb,400 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_xn_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_xn</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_xn</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_wzyf_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_wzyf</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_wzyf</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_risk_presto\">\n" +
                "                <minResources>1662976 mb,2000 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_risk_oper,mart_risk_model,mart_risk_ide_sys,mart_risk</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_risk_ide_sys,,mart_risk</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_mobile_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_mobile</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_mobile</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_jypt_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_jypt</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_jypt</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_dd_edw_presto\">\n" +
                "                <minResources>3662976 mb,1640 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>dd_edw</aclSubmitApps>\n" +
                "                <aclAdministerApps>dd_edw</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_tbi_presto\">\n" +
                "                <minResources>512000 mb,160 vcores,0 gcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>10</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_tbi_ide_sys,mart_tbi</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_tbi_ide_sys,mart_tbi</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jdw_up_presto\">\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>jdw_up_ide_sys,jdw_up</aclSubmitApps>\n" +
                "                <aclAdministerApps>jdw_up_ide_sys,jdw_up</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_mart_vdp___alluxio_presto\">\n" +
                "                <minResources>6291456 mb,1103 vcores,0 gcores</minResources>\n" +
                "                <maxResources>7549747 mb,1325 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>8</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclAdministerApps>mart_vdp</aclAdministerApps>\n" +
                "                <aclSubmitApps>mart_vdp</aclSubmitApps>\n" +
                "                <accessibleLabels>DEFAULT,MART_VDP___ALLUXIO</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_guanjia_presto\">\n" +
                "                <accessibleLabels>MART_CMO___PRESTO</accessibleLabels>\n" +
                "                <defaultLabel>MART_CMO___PRESTO</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_icc_presto\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_icc</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_icc</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_pop_presto\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_pop</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_pop</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_yhd_presto\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_yhd</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_yhd</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_mkt___alluxio_presto\">\n" +
                "                <accessibleLabels>DEFAULT,MART_CMO_MKT___ALLUXIO</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cmo_biee_presto\">\n" +
                "                <accessibleLabels>DEFAULT,10K_MART_COM___BIEE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cmo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cmo</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_troi_presto\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>0 mb,0 vcores</minResources>\n" +
                "                <maxResources>0 mb,0 vcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_troi</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_troi</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_vdp_presto1\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>2907136 mb,1680 vcores</minResources>\n" +
                "                <maxResources>3275776 mb,2016 vcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_vdp</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_vdp</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_eco_presto\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>512000 mb,160 vcores</minResources>\n" +
                "                <maxResources>32831400 mb,16464 vcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>xyw_dev,wj_da,mart_eco,core_dev,pk_rule_core,pk_rule_normal,pk_rule_master,crm_common_account,crm_core_account,promo_common_account,promo_core_account,IDE_query_account,mart_eco_ide_sys,eco_data_analy,pop_bod</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_eco</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_ipc_presto\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>211456 mb,50 vcores</minResources>\n" +
                "                <maxResources>3275776 mb,2016 vcores</maxResources>\n" +
                "                <maxRunningApps>9</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>cmo_ipc_ide_sys,cmo_ipc</aclSubmitApps>\n" +
                "                <aclAdministerApps>cmo_ipc_ide_sys,cmo_ipc</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_tbi\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_traffic\">\n" +
                "            <minResources>100943840 mb,20000 vcores,0 gcores</minResources>\n" +
                "            <maxResources>100943840 mb,20000 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>jdw_traffic_ide_sys,jdw_traffic</aclSubmitApps>\n" +
                "            <aclAdministerApps>jdw_traffic_ide_sys,jdw_traffic</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"jdw_traffic\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_isc\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_icc\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_tra\">\n" +
                "            <minResources>30480000 mb,20200 vcores,0 gcores</minResources>\n" +
                "            <maxResources>33720000 mb,32400 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>150</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_tra</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_tra</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_tra\">\n" +
                "            <maxRunningApps>150</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_dwm\">\n" +
                "            <minResources>0  mb,0 vcores,0 gcores</minResources>\n" +
                "            <maxResources>0 mb,0 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>0</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>jdw_dwm</aclSubmitApps>\n" +
                "            <aclAdministerApps>jdw_dwm</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"jdw_dwm\">\n" +
                "            <maxRunningApps>150</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"jdw_profile\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_up\">\n" +
                "            <minResources>27740416  mb,12000  vcores,0 gcores</minResources>\n" +
                "            <maxResources>71221250  mb,30000 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>jdw_up_ide_sys,jdw_up</aclSubmitApps>\n" +
                "            <aclAdministerApps>jdw_up_ide_sys,jdw_up</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"jdw_up\">\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_user_loss\">\n" +
                "            <minResources>11468800 mb,5600 vcores,0 gcores</minResources>\n" +
                "            <maxResources>22937600 mb,11200vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>jdw_loss,mart_jcs</aclSubmitApps>\n" +
                "            <aclAdministerApps>jdw_loss,mart_jcs</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "        </queue>\n" +
                "        <user name=\"jdw_loss\">\n" +
                "            <maxRunningApps>200</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_srd\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_cis_union\">\n" +
                "            <minResources>94665728 mb,29942 vcores,0 gcores</minResources>\n" +
                "            <maxResources>113598874 mb,35930 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_cis_ide_sys,mart_cis</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_cis_ide_sys,mart_cis</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_cis_offline_hive\">\n" +
                "                <minResources>18933145 mb,5988 vcores,0 gcores</minResources>\n" +
                "                <maxResources>22719774 mb,7186 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cis_ofc,mart_cis_block_chain,mart_cis_ide_sys,mart_cis</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cis_ide_sys,mart_cis</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cis_offline_spark\">\n" +
                "                <minResources>18933145  mb,5988 vcores,0 gcores</minResources>\n" +
                "                <maxResources>22719774 mb,7186 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>150</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cis_ofc,mart_cis_block_chain,mart_cis_ide_sys,mart_cis</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cis_ide_sys,mart_cis</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cis_online_spark\">\n" +
                "                <minResources>18933145  mb,5988 vcores,0 gcores</minResources>\n" +
                "                <maxResources>22719774 mb,7186 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cis_ofc,mart_cis_block_chain,mart_cis_ide_sys,mart_cis</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cis_ide_sys,mart_cis</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cis_offline_test\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <minResources>18933145 mb,5988 vcores,0 gcores</minResources>\n" +
                "                <maxResources>22719774  mb,7186 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>80</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cis_ofc,mart_cis_block_chain,mart_cis_ide_sys,mart_cis</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cis_ide_sys,mart_cis</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_cis_offline_ofc\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>18933145 mb,5988 vcores</minResources>\n" +
                "                <maxResources>22719774 mb,7186 vcores</maxResources>\n" +
                "                <maxRunningApps>80</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_cis_ofc,mart_cis_block_chain,mart_cis,mart_cis_ide_sys</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_cis,mart_cis_ide_sys</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_cis\">\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_coo_union\">\n" +
                "            <minResources>191643648 mb,62384 vcores,0 gcores</minResources>\n" +
                "            <maxResources>229220966 mb,74381 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>600</maxRunningApps>\n" +
                "            <weight>1.2</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_coo_spark\">\n" +
                "                <minResources>23592960 mb,20049 vcores,0 gcores</minResources>\n" +
                "                <maxResources>47185920 mb,40098 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>20</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_rdm\">\n" +
                "                <minResources>102400  mb,50  vcores,0 gcores</minResources>\n" +
                "                <maxResources>15728640  mb,3000  vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>11</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_wms\">\n" +
                "                <minResources>31457280 mb,26732 vcores,0 gcores</minResources>\n" +
                "                <maxResources>168341504  mb,154380 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_kf\">\n" +
                "                <minResources>47185920 mb,40098 vcores,0 gcores</minResources>\n" +
                "                <maxResources>168341504  mb,154380 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>150</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_afs\">\n" +
                "                <minResources>15728640 mb,13366 vcores,0 gcores</minResources>\n" +
                "                <maxResources>168341504  mb,154380 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_formal\">\n" +
                "                <minResources>191017472  mb,132060 vcores,0 gcores</minResources>\n" +
                "                <maxResources>229220966  mb,158472 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_ps\">\n" +
                "                <minResources>31457280 mb,26732 vcores,0 gcores</minResources>\n" +
                "                <maxResources>168341504 mb,154380 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>150</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_coo_core\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <minResources>211017472  mb,142060 vcores,0 gcores</minResources>\n" +
                "                <maxResources>229220966  mb,158472 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclAdministerApps>mart_coo</aclAdministerApps>\n" +
                "                <aclSubmitApps>mart_coo</aclSubmitApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_coo\">\n" +
                "            <maxRunningApps>600</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_fsh\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_risk_union\">\n" +
                "            <minResources>49774592 mb,39122 vcores,0 gcores</minResources>\n" +
                "            <maxResources>60607440 mb,49129 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>300</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_risk_model,mart_risk_oper,mart_risk_ide_sys,mart_risk</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_risk_model,mart_risk_oper,mart_risk_ide_sys,mart_risk</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_risk_formal\">\n" +
                "                <minResources>36061427  mb,31298  vcores,0 gcores</minResources>\n" +
                "                <maxResources>51516324  mb,49003  vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>300</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_risk_oper,mart_risk_model,mart_risk_ide_sys,mart_risk</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_risk_oper,mart_risk_model,mart_risk_ide_sys,mart_risk</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_risk_hkh\">\n" +
                "                <minResources>14545786  mb,17824  vcores,0 gcores</minResources>\n" +
                "                <maxResources>18182232  mb,19826  vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_risk_oper,mart_risk_model,mart_risk_ide_sys,mart_risk</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_risk_ide_sys,,mart_risk</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_risk_streaming\">\n" +
                "                <minResources>1719665  mb,8912  vcores,0 gcores</minResources>\n" +
                "                <maxResources>2149581  mb,9913  vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>80</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_risk_oper,mart_risk_model,mart_risk_ide_sys,mart_risk</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_risk_ide_sys,,mart_risk</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_risk\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_vdp_union\">\n" +
                "            <minResources>77387776 mb,24144 vcores,0 gcores</minResources>\n" +
                "            <maxResources>92865331 mb,30989 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fairWeightRatio</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_vdp_ide_sys,mart_vdp</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_vdp_ide_sys,mart_vdp</aclAdministerApps>\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queue name=\"bdp_jmart_vdp_dev\">\n" +
                "                <minResources>5242880 mb, 1796 vcores,0 gcores</minResources>\n" +
                "                <maxResources>6291456 mb, 2155 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_vdp_ide_sys,mart_vdp</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_vdp_ide_sys,mart_vdp</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_vdp_formal\">\n" +
                "                <minResources>45613056  mb,15479 vcores,0 gcores</minResources>\n" +
                "                <maxResources>54735667 mb,18574 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>250</maxRunningApps>\n" +
                "                <weight>2.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_vdp_ide_sys,mart_vdp</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_vdp_ide_sys,mart_vdp</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_vdp_spark\">\n" +
                "                <minResources>28590080  mb, 8597 vcores,0 gcores</minResources>\n" +
                "                <maxResources>34308096 mb, 10316 vcores,0 gcores</maxResources>\n" +
                "                <maxRunningApps>50</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_vdp_ide_sys,mart_vdp</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_vdp_ide_sys,mart_vdp</aclAdministerApps>\n" +
                "                <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_vdp\">\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_corejob_label\">\n" +
                "            <accessibleLabels>CORE,DEFAULT</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <minResources>81920000 mb,20000 vcores,0 gcores</minResources>\n" +
                "            <maxResources>81920000 mb,20000 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw_test</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw_test</aclAdministerApps>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_yhd\">\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_ai\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_gpu_union\">\n" +
                "            <accessibleLabels>GPU,K40</accessibleLabels>\n" +
                "            <defaultLabel>GPU</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>6440 mb,770 vcores,10 gcores</minResources>\n" +
                "            <maxResources>573440 mb,45770 vcores,64 gcores</maxResources>\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>*</aclSubmitApps>\n" +
                "            <aclAdministerApps>*</aclAdministerApps>\n" +
                "        </queue>\n" +
                "        <queue name=\"bdp_jmart_distcp_union\">\n" +
                "            <accessibleLabels>DISTCP</accessibleLabels>\n" +
                "            <defaultLabel>DISTCP</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>0 mb,0 vcores,0 gcores</minResources>\n" +
                "            <maxResources>56 mb,10 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw,jdw_traffic</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw,jdw_traffic</aclAdministerApps>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_troi\">\n" +
                "            <maxRunningApps>150</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jsmart_union\">\n" +
                "            <accessibleLabels>DEFAULT,CORE,QUEUE_TBI</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <assignedTimeout>-1</assignedTimeout>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>26507264 mb,5754 vcores</minResources>\n" +
                "            <maxResources>63164416 mb,17017 vcores</maxResources>\n" +
                "            <maxRunningApps>2000</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>*</aclSubmitApps>\n" +
                "            <aclAdministerApps>*</aclAdministerApps>\n" +
                "            <queue name=\"bdp_jmart_ai_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>4500000 mb,4570 vcores</minResources>\n" +
                "                <maxResources>5734400 mb,5770 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_ai</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_ai</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_pcl\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>2300000 mb,3320 vcores</minResources>\n" +
                "                    <maxResources>3734400 mb,4770 vcores</maxResources>\n" +
                "                    <maxRunningApps>20</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_ai</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_ai</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_ai\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>2300000 mb,2470 vcores</minResources>\n" +
                "                    <maxResources>3734400 mb,3770 vcores</maxResources>\n" +
                "                    <maxRunningApps>30</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_ai</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_ai</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_fsh_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>573440 mb,280 vcores</minResources>\n" +
                "                <maxResources>688128 mb,336 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_fsh</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_fsh</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_fsh_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>229376 mb,160 vcores</minResources>\n" +
                "                    <maxResources>286720 mb,200 vcores</maxResources>\n" +
                "                    <maxRunningApps>30</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_fsh</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_fsh</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_fsh_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>401408 mb,196 vcores</minResources>\n" +
                "                    <maxResources>473440 mb,240 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_fsh</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_fsh</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_fsh_spark\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>573440 mb,45770 vcores</maxResources>\n" +
                "                    <maxRunningApps>9</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_fsh</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_fsh</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_icc_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>13224350 mb,2696 vcores</minResources>\n" +
                "                <maxResources>15766001 mb,3966 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_icc_ide_sys,mart_icc</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_icc_ide_sys,mart_icc</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_icc_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>17031168 mb,5166 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_icc_ide_sys,mart_icc</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_icc_ide_sys,mart_icc</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_icc_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>14278656 mb,3696 vcores</minResources>\n" +
                "                    <maxResources>17031168 mb,5166 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_icc_ide_sys,mart_icc</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_icc_ide_sys,mart_icc</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_isc_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>1720320 mb,280 vcores</minResources>\n" +
                "                <maxResources>2064384 mb,336 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_isc_ide_sys,mart_isc</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_isc_ide_sys,mart_isc</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_isc_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>286720 mb,140 vcores</minResources>\n" +
                "                    <maxResources>344064 mb,168 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_isc_ide_sys,mart_isc</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_isc_ide_sys,mart_isc</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_isc_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>573440 mb,280 vcores</minResources>\n" +
                "                    <maxResources>688128 mb,336 vcores</maxResources>\n" +
                "                    <maxRunningApps>80</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_isc_ide_sys,mart_isc</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_isc_ide_sys,mart_isc</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_srd_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>12558336 mb,2336 vcores</minResources>\n" +
                "                <maxResources>14950400 mb,3650 vcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_srd</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_srd</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_srd_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>8790836 mb,1636 vcores</minResources>\n" +
                "                    <maxResources>10465280 mb,2585 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_srd</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_srd</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_srd_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>3767500 mb,700 vcores</minResources>\n" +
                "                    <maxResources>4485120 mb,1095 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_srd</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_srd</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_tbi_union\">\n" +
                "                <accessibleLabels>QUEUE_TBI</accessibleLabels>\n" +
                "                <defaultLabel>QUEUE_TBI</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>11296769 mb,2708 vcores</minResources>\n" +
                "                <maxResources>13467648 mb,3876 vcores</maxResources>\n" +
                "                <maxRunningApps>350</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_tbi_ide_sys,mart_tbi</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_tbi_ide_sys,mart_tbi</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_tbi_dev\">\n" +
                "                    <accessibleLabels>QUEUE_TBI</accessibleLabels>\n" +
                "                    <defaultLabel>QUEUE_TBI</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>5648384 mb,1354 vcores</minResources>\n" +
                "                    <maxResources>6935297 mb,3876 vcores</maxResources>\n" +
                "                    <maxRunningApps>150</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_tbi_ide_sys,mart_tbi</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_tbi_ide_sys,mart_tbi</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_tbi_formal\">\n" +
                "                    <accessibleLabels>QUEUE_TBI</accessibleLabels>\n" +
                "                    <defaultLabel>QUEUE_TBI</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>5648384 mb,1354 vcores</minResources>\n" +
                "                    <maxResources>13467648 mb,3876 vcores</maxResources>\n" +
                "                    <maxRunningApps>200</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_tbi_ide_sys,mart_tbi</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_tbi_ide_sys,mart_tbi</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_troi_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>1464320 mb,1200 vcores</minResources>\n" +
                "                <maxResources>11757184 mb,1240 vcores</maxResources>\n" +
                "                <maxRunningApps>150</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_troi</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_troi</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_troi_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>1120256 mb,144 vcores</minResources>\n" +
                "                    <maxResources>1344307 mb,172 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_troi</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_troi</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_troi_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>344064 mb,56 vcores</minResources>\n" +
                "                    <maxResources>412876 mb,200 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_troi</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_troi</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_yhd_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>36225920 mb,5520 vcores</minResources>\n" +
                "                <maxResources>76225920 mb,10021 vcores</maxResources>\n" +
                "                <maxRunningApps>50</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_yhd_ide_sys,mart_yhd</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_yhd_ide_sys,mart_yhd</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_yhd_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>2614886 mb,486 vcores</minResources>\n" +
                "                    <maxResources>3112960 mb,760 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_yhd_ide_sys,mart_yhd</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_yhd_ide_sys,mart_yhd</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_yhd_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>36225920 mb,5520 vcores</minResources>\n" +
                "                    <maxResources>76225920 mb,10021 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_yhd_ide_sys,mart_yhd</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_yhd_ide_sys,mart_yhd</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_vda_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>1720320 mb,320 vcores</minResources>\n" +
                "                <maxResources>2048000 mb,500 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>vda_algorithm,jd_10k_jiot,mart_vda,jd_10k_aidata,mart_vda_ide_sys</aclSubmitApps>\n" +
                "                <aclAdministerApps>vda_algorithm,jd_10k_jiot,mart_vda,jd_10k_aidata,mart_vda_ide_sys</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_vda_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>820320 mb,180 vcores</minResources>\n" +
                "                    <maxResources>1220320 mb,220 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>vda_algorithm,jd_10k_jiot,mart_vda,jd_10k_aidata,mart_vda_ide_sys</aclSubmitApps>\n" +
                "                    <aclAdministerApps>vda_algorithm,jd_10k_jiot,mart_vda,jd_10k_aidata,mart_vda_ide_sys</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_vda_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>1420320 mb,281 vcores</minResources>\n" +
                "                    <maxResources>1720320 mb,320 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>vda_algorithm,jd_10k_jiot,mart_vda,jd_10k_aidata,mart_vda_ide_sys</aclSubmitApps>\n" +
                "                    <aclAdministerApps>vda_algorithm,jd_10k_jiot,mart_vda,jd_10k_aidata,mart_vda_ide_sys</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_jcs_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <assignedTimeout>-1</assignedTimeout>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>17203200 mb,5600 vcores</minResources>\n" +
                "                <maxResources>20643840 mb,6720 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_jcs_ide_sys,mart_jcs</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_jcs_ide_sys,mart_jcs</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_jcs_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>1720320 mb,320 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_jcs_ide_sys,mart_jcs</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_jcs_ide_sys,mart_jcs</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_jcs_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <assignedTimeout>-1</assignedTimeout>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>1720320 mb,320 vcores</maxResources>\n" +
                "                    <maxRunningApps>50</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_jcs_ide_sys,mart_jcs</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_jcs_ide_sys,mart_jcs</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_jcloud_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>1146880 mb,640 vcores</minResources>\n" +
                "                <maxResources>1376256 mb,768 vcores</maxResources>\n" +
                "                <maxRunningApps>90</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_jcloud_ide_sys,mart_jcloud</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_jcloud_ide_sys,mart_jcloud</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_jcloud_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>229376 mb,128 vcores</minResources>\n" +
                "                    <maxResources>275251 mb,154 vcores</maxResources>\n" +
                "                    <maxRunningApps>80</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_jcloud_ide_sys,mart_jcloud</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_jcloud_ide_sys,mart_jcloud</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_jcloud_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>229376 mb,512 vcores</minResources>\n" +
                "                    <maxResources>1101005 mb,614 vcores</maxResources>\n" +
                "                    <maxRunningApps>80</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_jcloud_ide_sys,mart_jcloud</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_jcloud_ide_sys,mart_jcloud</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_tob_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>573440 mb,320 vcores</minResources>\n" +
                "                <maxResources>688128 mb,384 vcores</maxResources>\n" +
                "                <maxRunningApps>150</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_tob,mart_tob_ide_sys</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_tob,mart_tob_ide_sys</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_tob_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>114688 mb,64 vcores</minResources>\n" +
                "                    <maxResources>137626 mb,77 vcores</maxResources>\n" +
                "                    <maxRunningApps>90</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>tob_analysis,mart_tob,mart_tob_ide_sys</aclSubmitApps>\n" +
                "                    <aclAdministerApps>tob_analysis,mart_tob,mart_tob_ide_sys</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_tob_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>458752 mb,256 vcores</minResources>\n" +
                "                    <maxResources>550502 mb,307 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_tob,mart_tob_ide_sys</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_tob,mart_tob_ide_sys</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_rmb_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>10493952 mb,1952 vcores</minResources>\n" +
                "                <maxResources>12592743 mb,3050 vcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_rmb_ide_sys,mart_rmb</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_rmb_ide_sys,mart_rmb</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_rmb_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>0 mb,0 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_rmb</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_rmb</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_rmb_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>0 mb,0 vcores</maxResources>\n" +
                "                    <maxRunningApps>150</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_rmb</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_rmb</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_rmb_check\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>0 mb,0 vcores</minResources>\n" +
                "                    <maxResources>0 mb,0 vcores</maxResources>\n" +
                "                    <maxRunningApps>9</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_rmb</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_rmb</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_rmb_red\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>10485760 mb,1952 vcores</minResources>\n" +
                "                    <maxResources>12582912 mb,3050 vcores</maxResources>\n" +
                "                    <maxRunningApps>9</maxRunningApps>\n" +
                "                    <weight>5</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_rmb_ide_sys,mart_rmb</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_rmb_ide_sys,mart_rmb</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_rmb_yellow\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>10485760 mb,1952 vcores</minResources>\n" +
                "                    <maxResources>12582912 mb,3050 vcores</maxResources>\n" +
                "                    <maxRunningApps>150</maxRunningApps>\n" +
                "                    <weight>3</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_rmb_ide_sys,mart_rmb</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_rmb_ide_sys,mart_rmb</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_rmb_green\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>10485760 mb,1952 vcores</minResources>\n" +
                "                    <maxResources>12582912 mb,3050 vcores</maxResources>\n" +
                "                    <maxRunningApps>100</maxRunningApps>\n" +
                "                    <weight>2</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_rmb_ide_sys,mart_rmb</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_rmb_ide_sys,mart_rmb</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_pdo_union\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>1720320 mb,320 vcores</minResources>\n" +
                "                <maxResources>2048000 mb,500 vcores</maxResources>\n" +
                "                <maxRunningApps>500</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_pdo</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_pdo</aclAdministerApps>\n" +
                "                <queue name=\"bdp_jmart_pdo_dev\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>516096 mb,96 vcores</minResources>\n" +
                "                    <maxResources>614400 mb,150 vcores</maxResources>\n" +
                "                    <maxRunningApps>200</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_pdo</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_pdo</aclAdministerApps>\n" +
                "                </queue>\n" +
                "                <queue name=\"bdp_jmart_pdo_formal\">\n" +
                "                    <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                    <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                    <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                    <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                    <minResources>1204224 mb,224 vcores</minResources>\n" +
                "                    <maxResources>1433600 mb,350 vcores</maxResources>\n" +
                "                    <maxRunningApps>300</maxRunningApps>\n" +
                "                    <weight>1.0</weight>\n" +
                "                    <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                    <aclSubmitApps>mart_pdo</aclSubmitApps>\n" +
                "                    <aclAdministerApps>mart_pdo</aclAdministerApps>\n" +
                "                </queue>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_vda\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_jcs\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_jcloud\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_tob\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_rmb\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"dd_edw_rtf\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jdw_dd_edw_rtf\">\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>52000000 mb,40000 vcores,0 gcores</minResources>\n" +
                "            <maxResources>57344000 mb,50700 vcores,0 gcores</maxResources>\n" +
                "            <maxRunningApps>25</maxRunningApps>\n" +
                "            <weight>0.8</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw_rtf</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw_rtf</aclAdministerApps>\n" +
                "        </queue>\n" +
                "        <queue name=\"dd_edw_rtf_test\">\n" +
                "            <accessibleLabels>DEFAULT,CORE,COREJOB_LABEL</accessibleLabels>\n" +
                "            <defaultLabel>COREJOB_LABEL</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>675840 mb,440 vcores</minResources>\n" +
                "            <maxResources>1351680 mb,440 vcores</maxResources>\n" +
                "            <maxRunningApps>25</maxRunningApps>\n" +
                "            <weight>0.8</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw_rtf</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw_rtf</aclAdministerApps>\n" +
                "        </queue>\n" +
                "        <queue name=\"bdp_jmart_eco_union\">\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>13250560 mb,2400 vcores</minResources>\n" +
                "            <maxResources>15769600 mb,3808 vcores</maxResources>\n" +
                "            <maxRunningApps>500</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>xyw_dev,wj_da,mart_eco</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_eco</aclAdministerApps>\n" +
                "            <queue name=\"bdp_jmart_eco_dev\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>3616768 mb,608 vcores</minResources>\n" +
                "                <maxResources>4300800 mb,1008 vcores</maxResources>\n" +
                "                <maxRunningApps>200</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>xyw_dev,wj_da,mart_eco,core_dev,pk_rule_core,pk_rule_normal,pk_rule_master,crm_common_account,crm_core_account,promo_common_account,promo_core_account,IDE_query_account,mart_eco_ide_sys,eco_data_analy,pop_bod</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_eco</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_eco_formal\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>9633792 mb,1792 vcores</minResources>\n" +
                "                <maxResources>11468800 mb,2800 vcores</maxResources>\n" +
                "                <maxRunningApps>300</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>xyw_dev,wj_da,mart_eco,core_dev,pk_rule_core,pk_rule_normal,pk_rule_master,crm_common_account,crm_core_account,promo_common_account,promo_core_account,IDE_query_account,mart_eco_ide_sys,eco_data_analy,pop_bod</aclSubmitApps>\n" +
                "                <aclAdministerApps>promo_core_account,mart_eco,core_dev</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_eco\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <user name=\"mart_pdo\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_lim_union\">\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>1720320 mb,920 vcores</minResources>\n" +
                "            <maxResources>2048000 mb,1500 vcores</maxResources>\n" +
                "            <maxRunningApps>50</maxRunningApps>\n" +
                "            <weight>0.8</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>mart_lim</aclSubmitApps>\n" +
                "            <aclAdministerApps>mart_lim</aclAdministerApps>\n" +
                "            <queue name=\"bdp_jmart_lim_dev\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>409600 mb,100 vcores</minResources>\n" +
                "                <maxResources>409600 mb,100 vcores</maxResources>\n" +
                "                <maxRunningApps>20</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_lim</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_lim</aclAdministerApps>\n" +
                "            </queue>\n" +
                "            <queue name=\"bdp_jmart_lim_formal\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>1720320 mb,820 vcores</minResources>\n" +
                "                <maxResources>2048000 mb,1500 vcores</maxResources>\n" +
                "                <maxRunningApps>30</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_lim</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_lim</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <user name=\"mart_lim\">\n" +
                "            <maxRunningApps>10</maxRunningApps>\n" +
                "        </user>\n" +
                "        <queue name=\"bdp_jmart_streaming_union\">\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>2150400 mb,700 vcores</minResources>\n" +
                "            <maxResources>2560001 mb,850 vcores</maxResources>\n" +
                "            <maxRunningApps>50</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>*</aclSubmitApps>\n" +
                "            <aclAdministerApps>*</aclAdministerApps>\n" +
                "            <queue name=\"bdp_jmart_risk_streaming\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>2150400 mb,700 vcores</minResources>\n" +
                "                <maxResources>2560000 mb,850 vcores</maxResources>\n" +
                "                <maxRunningApps>50</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>mart_risk_oper,mart_risk_model,mart_risk_ide_sys,mart_risk</aclSubmitApps>\n" +
                "                <aclAdministerApps>mart_risk_ide_sys,,mart_risk</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "        <queue name=\"bdp_jdw_dd_edw_spark\">\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>38812800 mb,13924 vcores</minResources>\n" +
                "            <maxResources>557344001 mb,100000 vcores</maxResources>\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw_test,dd_edw,dd_edw_spark</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw</aclAdministerApps>\n" +
                "        </queue>\n" +
                "        <queue name=\"bdp_jdw_dd_edw_union\">\n" +
                "            <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "            <defaultLabel>DEFAULT</defaultLabel>\n" +
                "            <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "            <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "            <minResources>38812800 mb,13924 vcores</minResources>\n" +
                "            <maxResources>68812800 mb,18924 vcores</maxResources>\n" +
                "            <maxRunningApps>100</maxRunningApps>\n" +
                "            <weight>1.0</weight>\n" +
                "            <schedulingPolicy>fair</schedulingPolicy>\n" +
                "            <aclSubmitApps>dd_edw</aclSubmitApps>\n" +
                "            <aclAdministerApps>dd_edw</aclAdministerApps>\n" +
                "            <queue name=\"bdp_jdw_dd_edw_spark\">\n" +
                "                <accessibleLabels>DEFAULT,CORE</accessibleLabels>\n" +
                "                <defaultLabel>DEFAULT</defaultLabel>\n" +
                "                <queueMaxMapsForEachJob>2147483647</queueMaxMapsForEachJob>\n" +
                "                <queueMaxReducesForEachJob>2147483647</queueMaxReducesForEachJob>\n" +
                "                <minResources>38812800 mb,13924 vcores</minResources>\n" +
                "                <maxResources>68812800 mb,18924 vcores</maxResources>\n" +
                "                <maxRunningApps>100</maxRunningApps>\n" +
                "                <weight>1.0</weight>\n" +
                "                <schedulingPolicy>fair</schedulingPolicy>\n" +
                "                <aclSubmitApps>dd_edw_test,dd_edw</aclSubmitApps>\n" +
                "                <aclAdministerApps>dd_edw</aclAdministerApps>\n" +
                "            </queue>\n" +
                "        </queue>\n" +
                "    </queue>\n" +
                "    <userMaxAppsDefault>1500</userMaxAppsDefault>\n" +
                "    <defaultQueueSchedulingPolicy>fair</defaultQueueSchedulingPolicy>\n" +
                "    <clusterNodeLabels>DEFAULT,CORE,MART_VDP___ALLUXIO,GPU,K40,DISTCPMART_CMO_MKT___ALLUXIO,10K_MART_COM___BIEE,IPC,UNUSED,CGROUP,IPC</clusterNodeLabels>\n" +
                "</allocations>";
        System.out.println(s.length());
    }
}
