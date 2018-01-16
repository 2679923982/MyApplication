package com.example.fuck.myapplication.model.bean.bean;

import java.util.List;

/**
 * Created by MK on 2017/12/28.
 */

public class SongBean {

    /**
     * song_list : [{"artist_id":"88","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-22","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/9b90b83c17e694eaedb354fd8d19fcff/568325003/568325003.lrc","copy_type":"1","hot":"123386","all_artist_ting_uid":"2517","resource_type":"0","is_new":"1","rank_change":"0","rank":"1","all_artist_id":"88","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":235,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","res_encryption_flag":"0","song_id":"568320992","title":"狐狸（电影《二代妖精之今生有幸》推广曲）","ting_uid":"2517","author":"薛之谦","album_id":"568320989","album_title":"狐狸（电影《二代妖精之今生有幸》推广曲）","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"薛之谦","pic_radio":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_1000,h_1000"},{"artist_id":"1641","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-27","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/aac3ec9d550094dc94d8a792e74e2ad5/567270931/567270931.lrc","copy_type":"1","hot":"148124","all_artist_ting_uid":"1579","resource_type":"0","is_new":"1","rank_change":"4","rank":"2","all_artist_id":"1641","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":260,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"华宇世博音乐文化（北京）有限公司-亚神","res_encryption_flag":"0","song_id":"567270530","title":"言不由衷","ting_uid":"1579","author":"徐佳莹","album_id":"568564580","album_title":"心里学","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"徐佳莹","pic_radio":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_1000,h_1000"},{"artist_id":"362","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/c7f49519b856ab158bee607dd45c60fe/568249523/568249523.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/c7f49519b856ab158bee607dd45c60fe/568249523/568249523.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-19","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/694a054c9417628f6012b756126c5449/568249957/568249957.lrc","copy_type":"1","hot":"100109","all_artist_ting_uid":"1219","resource_type":"0","is_new":"1","rank_change":"-1","rank":"3","all_artist_id":"362","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":307,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"电影《芳华》片尾曲","has_filmtv":"0","si_proxycompany":"肆想文化传媒（北京）有限责任公司","res_encryption_flag":"0","song_id":"568249533","title":"绒花","ting_uid":"1219","author":"韩红","album_id":"568249531","album_title":"绒花","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"韩红","pic_radio":"http://qukufile2.qianqian.com/data2/pic/c7f49519b856ab158bee607dd45c60fe/568249523/568249523.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/c7f49519b856ab158bee607dd45c60fe/568249523/568249523.jpg","pic_premium":"http://qukufile2.qianqian.com/data2/pic/c7f49519b856ab158bee607dd45c60fe/568249523/568249523.jpg","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/c7f49519b856ab158bee607dd45c60fe/568249523/568249523.jpg","album_800_800":"","album_1000_1000":""},{"artist_id":"128","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-10","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/de483f1eac2296b5d5ab9e708d2e12dd/567490737/567490737.lrc","copy_type":"1","hot":"67959","all_artist_ting_uid":"1099","resource_type":"0","is_new":"1","rank_change":"0","rank":"4","all_artist_id":"128","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":188,"has_mv_mobile":0,"versions":"影视原声","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"电影《解忧杂货店》主题曲","has_filmtv":"0","si_proxycompany":"奔跑怪物（北京）文化娱乐有限公司","res_encryption_flag":"0","song_id":"567490741","title":"重生","ting_uid":"1099","author":"容祖儿","album_id":"567490739","album_title":"重生","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"容祖儿","pic_radio":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/6fef0c34cd090994cd58c1a2bfab6ba8/567490470/567490470.jpg@s_1,w_1000,h_1000"},{"artist_id":"567299514","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/4a2cffbaf32b0a7cb77986bc483e8642/567298831/567298831.JPG@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/4a2cffbaf32b0a7cb77986bc483e8642/567298831/567298831.JPG@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-05","album_no":"12","lrclink":"http://qukufile2.qianqian.com/data2/lrc/b354311e0140f2cda8e1787d4668e04e/567299539/567299539.lrc","copy_type":"1","hot":"151541","all_artist_ting_uid":"340290414","resource_type":"0","is_new":"1","rank_change":"0","rank":"5","all_artist_id":"567299514","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64","file_duration":266,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"","info":"","has_filmtv":"0","si_proxycompany":"北京唱吧科技股份有限公司","res_encryption_flag":"0","song_id":"567299854","title":"我们不一样","ting_uid":"340290414","author":"Mc黑总 bb机登录用户","album_id":"567299830","album_title":"唱吧精选","is_first_publish":0,"havehigh":0,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"Mc黑总 bb机登录用户","pic_radio":"http://qukufile2.qianqian.com/data2/pic/4a2cffbaf32b0a7cb77986bc483e8642/567298831/567298831.JPG@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/4a2cffbaf32b0a7cb77986bc483e8642/567298831/567298831.JPG","pic_premium":"http://qukufile2.qianqian.com/data2/pic/4a2cffbaf32b0a7cb77986bc483e8642/567298831/567298831.JPG","pic_huge":"","album_500_500":"http://qukufile2.qianqian.com/data2/pic/4a2cffbaf32b0a7cb77986bc483e8642/567298831/567298831.JPG","album_800_800":"","album_1000_1000":""},{"artist_id":"1665","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-11","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/9d923fe8df5c82aa38fb1992214e2c05/567626249/567626249.lrc","copy_type":"1","hot":"52408","all_artist_ting_uid":"2611","resource_type":"0","is_new":"1","rank_change":"1","rank":"6","all_artist_id":"1665","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":284,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","res_encryption_flag":"0","song_id":"567479594","title":"如我","ting_uid":"2611","author":"刘惜君","album_id":"567479590","album_title":"如我","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"刘惜君","pic_radio":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/c03146e2d2905a24281d2b97b556495b/567479591/567479591.jpg@s_1,w_1000,h_1000"},{"artist_id":"1641","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-12-27","album_no":"2","lrclink":"http://qukufile2.qianqian.com/data2/lrc/d80873123a644c0a5610dc02c7dffc1b/568270394/568270394.lrc","copy_type":"1","hot":"42774","all_artist_ting_uid":"1579","resource_type":"0","is_new":"1","rank_change":"1","rank":"7","all_artist_id":"1641","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":323,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","res_encryption_flag":"0","song_id":"568221179","title":"灰色","ting_uid":"1579","author":"徐佳莹","album_id":"568564580","album_title":"心里学","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":1,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"徐佳莹","pic_radio":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/1ffc1e912125f7dc708f5c17f14b8aec/568564581/568564581.jpg@s_1,w_1000,h_1000"},{"artist_id":"88","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-28","album_no":"8","lrclink":"http://qukufile2.qianqian.com/data2/lrc/6ce9fb402254c7173f495bec7f855fbb/566879821/566879821.lrc","copy_type":"1","hot":"200014","all_artist_ting_uid":"2517","resource_type":"0","is_new":"1","rank_change":"-5","rank":"8","all_artist_id":"88","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":266,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","res_encryption_flag":"0","song_id":"566878465","title":"背过手","ting_uid":"2517","author":"薛之谦","album_id":"538777110","album_title":"渡 The Crossing","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"薛之谦","pic_radio":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/ee6432f2ef6420d0632cb897f3f0f7fb/566871160/566871160.jpg@s_1,w_1000,h_1000"},{"artist_id":"60411232","language":"英语","pic_big":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_90,h_90","country":"欧美","area":"2","publishtime":"2017-12-15","album_no":"3","lrclink":"http://qukufile2.qianqian.com/data2/lrc/17f153074e3f1599d407d431937ab632/568136333/568136333.lrc","copy_type":"1","hot":"33824","all_artist_ting_uid":"135988614,232944956","resource_type":"0","is_new":"1","rank_change":"2","rank":"9","all_artist_id":"60411232,124115102","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256","file_duration":268,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"129|-1\",\"1\":\"-1|-1\"}","biaoshi":"first,vip","info":"","has_filmtv":"0","si_proxycompany":"深圳腾讯计算机系统有限公司索尼音乐","res_encryption_flag":"0","song_id":"568110404","title":"Him & I","ting_uid":"135988614","author":"G-Eazy,Halsey","album_id":"568110380","album_title":"The Beautiful & Damned","is_first_publish":0,"havehigh":0,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"G-Eazy,Halsey","pic_radio":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/363fb5e6099c097fa393df3346782239/568110381/568110381.jpg@s_1,w_1000,h_1000"},{"artist_id":"1483","language":"国语","pic_big":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_150,h_150","pic_small":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_90,h_90","country":"内地","area":"0","publishtime":"2017-11-30","album_no":"1","lrclink":"http://qukufile2.qianqian.com/data2/lrc/d61595840e618cd5948542d292564eeb/567011565/567011565.lrc","copy_type":"1","hot":"95772","all_artist_ting_uid":"1557","resource_type":"0","is_new":"1","rank_change":"0","rank":"10","all_artist_id":"1483","style":"","del_status":"0","relate_status":"0","toneid":"0","all_rate":"64,128,256,320,flac","file_duration":320,"has_mv_mobile":0,"versions":"","bitrate_fee":"{\"0\":\"0|0\",\"1\":\"0|0\"}","biaoshi":"first,lossless","info":"","has_filmtv":"0","si_proxycompany":"TAIHE MUSIC GROUP","res_encryption_flag":"0","song_id":"566699464","title":"蝴蝶的时间","ting_uid":"1557","author":"许嵩","album_id":"566699461","album_title":"蝴蝶的时间","is_first_publish":0,"havehigh":2,"charge":0,"has_mv":0,"learn":0,"song_source":"web","piao_id":"0","korean_bb_song":"0","resource_type_ext":"0","mv_provider":"0000000000","artist_name":"许嵩","pic_radio":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_300,h_300","pic_s500":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_500,h_500","pic_premium":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_500,h_500","pic_huge":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_1000,h_1000","album_500_500":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_500,h_500","album_800_800":"","album_1000_1000":"http://qukufile2.qianqian.com/data2/pic/6a18940447906a4ea5125c26b3341080/566699462/566699462.jpg@s_1,w_1000,h_1000"}]
     * billboard : {"billboard_type":"1","billboard_no":"2422","update_date":"2017-12-28","billboard_songnum":"141","havemore":1,"name":"新歌榜","comment":"该榜单是根据百度音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次","pic_s192":"http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7caf39ebc10f11fbe096b63a968.jpg","pic_s640":"http://c.hiphotos.baidu.com/ting/pic/item/f7246b600c33874495c4d089530fd9f9d62aa0c6.jpg","pic_s444":"http://d.hiphotos.baidu.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg","pic_s260":"http://b.hiphotos.baidu.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg","pic_s210":"http://business.cdn.qianqian.com/qianqian/pic/bos_client_c49310115801d43d42a98fdc357f6057.jpg","web_url":"http://music.baidu.com/top/new"}
     * error_code : 22000
     */

    private BillboardBean billboard;
    private int error_code;
    private List<SongListBean> song_list;

    public BillboardBean getBillboard() {
        return billboard;
    }

    public void setBillboard(BillboardBean billboard) {
        this.billboard = billboard;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<SongListBean> getSong_list() {
        return song_list;
    }

    public void setSong_list(List<SongListBean> song_list) {
        this.song_list = song_list;
    }

    public static class BillboardBean {
        /**
         * billboard_type : 1
         * billboard_no : 2422
         * update_date : 2017-12-28
         * billboard_songnum : 141
         * havemore : 1
         * name : 新歌榜
         * comment : 该榜单是根据百度音乐平台歌曲每日播放量自动生成的数据榜单，统计范围为近期发行的歌曲，每日更新一次
         * pic_s192 : http://b.hiphotos.baidu.com/ting/pic/item/9922720e0cf3d7caf39ebc10f11fbe096b63a968.jpg
         * pic_s640 : http://c.hiphotos.baidu.com/ting/pic/item/f7246b600c33874495c4d089530fd9f9d62aa0c6.jpg
         * pic_s444 : http://d.hiphotos.baidu.com/ting/pic/item/78310a55b319ebc4845c84eb8026cffc1e17169f.jpg
         * pic_s260 : http://b.hiphotos.baidu.com/ting/pic/item/e850352ac65c1038cb0f3cb0b0119313b07e894b.jpg
         * pic_s210 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_c49310115801d43d42a98fdc357f6057.jpg
         * web_url : http://music.baidu.com/top/new
         */

        private String billboard_type;
        private String billboard_no;
        private String update_date;
        private String billboard_songnum;
        private int havemore;
        private String name;
        private String comment;
        private String pic_s192;
        private String pic_s640;
        private String pic_s444;
        private String pic_s260;
        private String pic_s210;
        private String web_url;

        public String getBillboard_type() {
            return billboard_type;
        }

        public void setBillboard_type(String billboard_type) {
            this.billboard_type = billboard_type;
        }

        public String getBillboard_no() {
            return billboard_no;
        }

        public void setBillboard_no(String billboard_no) {
            this.billboard_no = billboard_no;
        }

        public String getUpdate_date() {
            return update_date;
        }

        public void setUpdate_date(String update_date) {
            this.update_date = update_date;
        }

        public String getBillboard_songnum() {
            return billboard_songnum;
        }

        public void setBillboard_songnum(String billboard_songnum) {
            this.billboard_songnum = billboard_songnum;
        }

        public int getHavemore() {
            return havemore;
        }

        public void setHavemore(int havemore) {
            this.havemore = havemore;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPic_s192() {
            return pic_s192;
        }

        public void setPic_s192(String pic_s192) {
            this.pic_s192 = pic_s192;
        }

        public String getPic_s640() {
            return pic_s640;
        }

        public void setPic_s640(String pic_s640) {
            this.pic_s640 = pic_s640;
        }

        public String getPic_s444() {
            return pic_s444;
        }

        public void setPic_s444(String pic_s444) {
            this.pic_s444 = pic_s444;
        }

        public String getPic_s260() {
            return pic_s260;
        }

        public void setPic_s260(String pic_s260) {
            this.pic_s260 = pic_s260;
        }

        public String getPic_s210() {
            return pic_s210;
        }

        public void setPic_s210(String pic_s210) {
            this.pic_s210 = pic_s210;
        }

        public String getWeb_url() {
            return web_url;
        }

        public void setWeb_url(String web_url) {
            this.web_url = web_url;
        }
    }

    public static class SongListBean {
        /**
         * artist_id : 88
         * language : 国语
         * pic_big : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_150,h_150
         * pic_small : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_90,h_90
         * country : 内地
         * area : 0
         * publishtime : 2017-12-22
         * album_no : 1
         * lrclink : http://qukufile2.qianqian.com/data2/lrc/9b90b83c17e694eaedb354fd8d19fcff/568325003/568325003.lrc
         * copy_type : 1
         * hot : 123386
         * all_artist_ting_uid : 2517
         * resource_type : 0
         * is_new : 1
         * rank_change : 0
         * rank : 1
         * all_artist_id : 88
         * style :
         * del_status : 0
         * relate_status : 0
         * toneid : 0
         * all_rate : 64,128,256,320,flac
         * file_duration : 235
         * has_mv_mobile : 0
         * versions :
         * bitrate_fee : {"0":"0|0","1":"0|0"}
         * biaoshi : first,lossless
         * info :
         * has_filmtv : 0
         * si_proxycompany : TAIHE MUSIC GROUP
         * res_encryption_flag : 0
         * song_id : 568320992
         * title : 狐狸（电影《二代妖精之今生有幸》推广曲）
         * ting_uid : 2517
         * author : 薛之谦
         * album_id : 568320989
         * album_title : 狐狸（电影《二代妖精之今生有幸》推广曲）
         * is_first_publish : 0
         * havehigh : 2
         * charge : 0
         * has_mv : 1
         * learn : 0
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * resource_type_ext : 0
         * mv_provider : 0000000000
         * artist_name : 薛之谦
         * pic_radio : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_300,h_300
         * pic_s500 : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_500,h_500
         * pic_premium : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_500,h_500
         * pic_huge : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_1000,h_1000
         * album_500_500 : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_500,h_500
         * album_800_800 :
         * album_1000_1000 : http://qukufile2.qianqian.com/data2/pic/1c2424e15b4f432d5ad65f69f0e2d11d/568328873/568328873.png@s_1,w_1000,h_1000
         */

        private String artist_id;
        private String language;
        private String pic_big;
        private String pic_small;
        private String country;
        private String area;
        private String publishtime;
        private String album_no;
        private String lrclink;
        private String copy_type;
        private String hot;
        private String all_artist_ting_uid;
        private String resource_type;
        private String is_new;
        private String rank_change;
        private String rank;
        private String all_artist_id;
        private String style;
        private String del_status;
        private String relate_status;
        private String toneid;
        private String all_rate;
        private int file_duration;
        private int has_mv_mobile;
        private String versions;
        private String bitrate_fee;
        private String biaoshi;
        private String info;
        private String has_filmtv;
        private String si_proxycompany;
        private String res_encryption_flag;
        private String song_id;
        private String title;
        private String ting_uid;
        private String author;
        private String album_id;
        private String album_title;
        private int is_first_publish;
        private int havehigh;
        private int charge;
        private int has_mv;
        private int learn;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String resource_type_ext;
        private String mv_provider;
        private String artist_name;
        private String pic_radio;
        private String pic_s500;
        private String pic_premium;
        private String pic_huge;
        private String album_500_500;
        private String album_800_800;
        private String album_1000_1000;

        public String getArtist_id() {
            return artist_id;
        }

        public void setArtist_id(String artist_id) {
            this.artist_id = artist_id;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getPic_small() {
            return pic_small;
        }

        public void setPic_small(String pic_small) {
            this.pic_small = pic_small;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getPublishtime() {
            return publishtime;
        }

        public void setPublishtime(String publishtime) {
            this.publishtime = publishtime;
        }

        public String getAlbum_no() {
            return album_no;
        }

        public void setAlbum_no(String album_no) {
            this.album_no = album_no;
        }

        public String getLrclink() {
            return lrclink;
        }

        public void setLrclink(String lrclink) {
            this.lrclink = lrclink;
        }

        public String getCopy_type() {
            return copy_type;
        }

        public void setCopy_type(String copy_type) {
            this.copy_type = copy_type;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getAll_artist_ting_uid() {
            return all_artist_ting_uid;
        }

        public void setAll_artist_ting_uid(String all_artist_ting_uid) {
            this.all_artist_ting_uid = all_artist_ting_uid;
        }

        public String getResource_type() {
            return resource_type;
        }

        public void setResource_type(String resource_type) {
            this.resource_type = resource_type;
        }

        public String getIs_new() {
            return is_new;
        }

        public void setIs_new(String is_new) {
            this.is_new = is_new;
        }

        public String getRank_change() {
            return rank_change;
        }

        public void setRank_change(String rank_change) {
            this.rank_change = rank_change;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getAll_artist_id() {
            return all_artist_id;
        }

        public void setAll_artist_id(String all_artist_id) {
            this.all_artist_id = all_artist_id;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getDel_status() {
            return del_status;
        }

        public void setDel_status(String del_status) {
            this.del_status = del_status;
        }

        public String getRelate_status() {
            return relate_status;
        }

        public void setRelate_status(String relate_status) {
            this.relate_status = relate_status;
        }

        public String getToneid() {
            return toneid;
        }

        public void setToneid(String toneid) {
            this.toneid = toneid;
        }

        public String getAll_rate() {
            return all_rate;
        }

        public void setAll_rate(String all_rate) {
            this.all_rate = all_rate;
        }

        public int getFile_duration() {
            return file_duration;
        }

        public void setFile_duration(int file_duration) {
            this.file_duration = file_duration;
        }

        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }

        public void setHas_mv_mobile(int has_mv_mobile) {
            this.has_mv_mobile = has_mv_mobile;
        }

        public String getVersions() {
            return versions;
        }

        public void setVersions(String versions) {
            this.versions = versions;
        }

        public String getBitrate_fee() {
            return bitrate_fee;
        }

        public void setBitrate_fee(String bitrate_fee) {
            this.bitrate_fee = bitrate_fee;
        }

        public String getBiaoshi() {
            return biaoshi;
        }

        public void setBiaoshi(String biaoshi) {
            this.biaoshi = biaoshi;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getHas_filmtv() {
            return has_filmtv;
        }

        public void setHas_filmtv(String has_filmtv) {
            this.has_filmtv = has_filmtv;
        }

        public String getSi_proxycompany() {
            return si_proxycompany;
        }

        public void setSi_proxycompany(String si_proxycompany) {
            this.si_proxycompany = si_proxycompany;
        }

        public String getRes_encryption_flag() {
            return res_encryption_flag;
        }

        public void setRes_encryption_flag(String res_encryption_flag) {
            this.res_encryption_flag = res_encryption_flag;
        }

        public String getSong_id() {
            return song_id;
        }

        public void setSong_id(String song_id) {
            this.song_id = song_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTing_uid() {
            return ting_uid;
        }

        public void setTing_uid(String ting_uid) {
            this.ting_uid = ting_uid;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAlbum_id() {
            return album_id;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public void setAlbum_title(String album_title) {
            this.album_title = album_title;
        }

        public int getIs_first_publish() {
            return is_first_publish;
        }

        public void setIs_first_publish(int is_first_publish) {
            this.is_first_publish = is_first_publish;
        }

        public int getHavehigh() {
            return havehigh;
        }

        public void setHavehigh(int havehigh) {
            this.havehigh = havehigh;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getHas_mv() {
            return has_mv;
        }

        public void setHas_mv(int has_mv) {
            this.has_mv = has_mv;
        }

        public int getLearn() {
            return learn;
        }

        public void setLearn(int learn) {
            this.learn = learn;
        }

        public String getSong_source() {
            return song_source;
        }

        public void setSong_source(String song_source) {
            this.song_source = song_source;
        }

        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }

        public void setKorean_bb_song(String korean_bb_song) {
            this.korean_bb_song = korean_bb_song;
        }

        public String getResource_type_ext() {
            return resource_type_ext;
        }

        public void setResource_type_ext(String resource_type_ext) {
            this.resource_type_ext = resource_type_ext;
        }

        public String getMv_provider() {
            return mv_provider;
        }

        public void setMv_provider(String mv_provider) {
            this.mv_provider = mv_provider;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public void setArtist_name(String artist_name) {
            this.artist_name = artist_name;
        }

        public String getPic_radio() {
            return pic_radio;
        }

        public void setPic_radio(String pic_radio) {
            this.pic_radio = pic_radio;
        }

        public String getPic_s500() {
            return pic_s500;
        }

        public void setPic_s500(String pic_s500) {
            this.pic_s500 = pic_s500;
        }

        public String getPic_premium() {
            return pic_premium;
        }

        public void setPic_premium(String pic_premium) {
            this.pic_premium = pic_premium;
        }

        public String getPic_huge() {
            return pic_huge;
        }

        public void setPic_huge(String pic_huge) {
            this.pic_huge = pic_huge;
        }

        public String getAlbum_500_500() {
            return album_500_500;
        }

        public void setAlbum_500_500(String album_500_500) {
            this.album_500_500 = album_500_500;
        }

        public String getAlbum_800_800() {
            return album_800_800;
        }

        public void setAlbum_800_800(String album_800_800) {
            this.album_800_800 = album_800_800;
        }

        public String getAlbum_1000_1000() {
            return album_1000_1000;
        }

        public void setAlbum_1000_1000(String album_1000_1000) {
            this.album_1000_1000 = album_1000_1000;
        }
    }
}
