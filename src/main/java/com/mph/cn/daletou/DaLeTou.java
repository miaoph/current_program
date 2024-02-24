package com.mph.cn.daletou;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.rowset.internal.Row;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: miaoph
 * @time: 2024/1/30 上午10:23
 */
public class DaLeTou {


    public static void main(String[] args) throws Exception {
        // 初始化行号
        int rowNum = 1;

        // 分页参数
        int pageSize = 100; // 每页数量
        int pageNo = 1;   // 当前页码

        // 循环变量，当为false时停止分页
        boolean hasMorePages = true;
        String result = HttpUtil.get("https://webapi.sporttery.cn/gateway/lottery/getHistoryPageListV1.qry" +
                "?gameNo=85&provinceId=0&pageSize=" + pageSize + "&isVerify=1&pageNo=" + pageNo);

        // 解析JSON数据
        JSONObject jsonObject = JSONObject.parseObject(result);
        JSONArray list = jsonObject.getJSONObject("value").getJSONArray("list");

        Map<String, Integer> qianQu = new TreeMap<>();
        Map<String, Integer> houQu = new TreeMap<>();

        System.out.println(list.size());
        ExcelWriter writer = ExcelUtil.getWriter("/Users/miaopenghang/logs/daletou.xlsx");
        List<List<String>> rows = new ArrayList<>();
        // 遍历并写入数据
        for (int i = 0; i < list.size(); i++) {
            JSONObject item = list.getJSONObject(i);
            String lotteryDrawNum = item.getString("lotteryDrawNum");
            String lotteryUnsortDrawresult = item.getString("lotteryUnsortDrawresult");
            List<String> row1 = CollUtil.newArrayList(lotteryDrawNum, lotteryUnsortDrawresult);
            rows.add(row1);

            //            List<String> collect = Arrays.stream(lotteryUnsortDrawresult.split(" ")).collect(Collectors.toList());
            //            for (int j=0 ;j<collect.size();j++){
            //                String num = collect.get(j);
            //                if(j>4){
            //                     Integer count = houQu.get(num);
            //                     if(Objects.nonNull(count)){
            //                         houQu.put(num,++count);
            //                     }else {
            //                         houQu.put(num,1);
            //                     }
            //                }else {
            //                    Integer count = qianQu.get(num);
            //                    if(Objects.nonNull(count)){
            //                        qianQu.put(num,++count);
            //                    }else {
            //                        qianQu.put(num,1);
            //                    }
            //                }
            //            }
            //        }
            //        List<DaLeTouModel> qianQuList = new ArrayList<>();
            //        qianQu.forEach((num,count)->{
            //             DaLeTouModel daLeTouModel = new DaLeTouModel();
            //            daLeTouModel.setNum(num);
            //            daLeTouModel.setCount(count);
            //            qianQuList.add(daLeTouModel);
            //        });
            //        List<DaLeTouModel> houQuList = new ArrayList<>();
            //        houQu.forEach((num,count)->{
            //            DaLeTouModel daLeTouModel = new DaLeTouModel();
            //            daLeTouModel.setNum(num);
            //            daLeTouModel.setCount(count);
            //            houQuList.add(daLeTouModel);
            //        });
            //         List<DaLeTouModel> qianQuSort = qianQuList.stream().sorted(Comparator.comparingInt(DaLeTouModel::getCount)).collect(Collectors.toList());
            //        List<DaLeTouModel> houQuSort = houQuList.stream().sorted(Comparator.comparingInt(DaLeTouModel::getCount)).collect(Collectors.toList());
            //        System.out.println(qianQuSort);
            //        System.out.println(houQuSort);

        }
        writer.write(rows, true);
        //关闭writer，释放内存
        writer.close();
    }

}
