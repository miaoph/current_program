package com.mph.cn.gupiao;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;

/**
 * @description:
 * @author: miaoph
 * @time: 2024/2/24 上午10:58
 */
public class GiPiaoSelect {
    public static void main(String[] args) {
        //        String result = HttpUtil.get(
        //                "https://finance.pae.baidu.com/vapi/v1/hotrank?tn=wisexmlnew&dsp=iphone&product=stock&day=20240224&hour=10&pn=0&rn=100&market=all&type=hour
        //                &finClientType=pc");
        //
        //        JSONObject jsonObject = JSONObject.parseObject(result);
        //        JSONObject resultJs = jsonObject.getJSONObject("Result");
        //        JSONArray bodyJa = resultJs.getJSONArray("body");
        //        for (int i = 0; i <= bodyJa.size() - 1; i++) {
        //            JSONArray bodyJaJSONArray = bodyJa.getJSONArray(i);
        //            String huzhi = bodyJaJSONArray.getString(5);
        //            String code = bodyJaJSONArray.getString(3);
        //            String name = bodyJaJSONArray.getString(0);
        //            if (huzhi.equals("SH") || huzhi.equals("SZ")),，
        //                System.out.println(name + "----" + code);
        //        }

//        SHOO1(2000);
    }

    public static void SHOO1(Integer startId) {
        String url = "https://gushitong.baidu.com/opendata?resource_id=5352&query=000001&code=000001&name=%E4%B8%8A%E8%AF%81%E6%8C%87%E6%95%B0&market=ab&group=asyn_ranking&pn="+startId +
                "&rn=50" +
                "&pc_web=1&finClientType=pc";
        String result = HttpUtil.get(url);
        JSONObject jsonObject = JSONObject.parseObject(result);
        JSONArray resultJsArray = jsonObject.getJSONArray("Result");
        JSONObject resultJs = resultJsArray.getJSONObject(0);
        JSONObject displayData = resultJs.getJSONObject("DisplayData");
        JSONObject resultData = displayData.getJSONObject("resultData");
        JSONObject tplData = resultData.getJSONObject("tplData");
        JSONObject tplResult = tplData.getJSONObject("result");
        JSONArray tplList = tplResult.getJSONArray("list");
        for (int i = 0; i < tplList.size(); i++) {
            JSONObject tplJSONObject = tplList.getJSONObject(i);
            String code = tplJSONObject.getString("code");
            String name = tplJSONObject.getString("name");
            JSONObject ratio = tplJSONObject.getJSONObject("ratio");
             String status = ratio.getString("status");
             String value = ratio.getString("value");
            System.out.println(name + "----" + code+"------"+status+"--------"+value);

        }

    }



}
