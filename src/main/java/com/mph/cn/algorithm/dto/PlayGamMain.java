package com.mph.cn.algorithm.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.util.*;

/**
 * @description:
 * @author: miaoph
 * @time: 2022/9/20 上午11:13
 */
public class PlayGamMain {

   static ThreadLocal<Integer> tl = new ThreadLocal<>();

    public static void main(String[] args) {
//        Integer 胡萝卜=0;
//        Integer 草=0;
//        Integer 铲子=0;
//        Integer 水桶=0;
//        Integer 奶瓶=0;
//        Integer 火把=0;
//        Integer 叉子=0;
//        Integer 拳套=0;
//        Integer 白菜=0;
//        Integer 线球=0;
//        Integer 草把=0;
//
//
//        for(int i=0 ;i<40;i++){
//            System.out.println( Math.floor((Math.random()+1)*(3)));
//        }

//        List<Integer> list = new ArrayList<>();
//                list.add(1);
//                list.add(2);
//                list.add(3);
//        List<Integer> list1 =  new ArrayList<>();
//        list1.add(2);
//        list1.add(3);
//        final boolean b = list1.retainAll(list);
//                System.out.println(b);
//        System.out.println(list);
//        System.out.println(JSONObject.toJSON(list1));

//         JSONArray jsonArray = JSON.parseArray(getstr());
//         Set<Long> set= new HashSet<>();
//         int k=0;
//        for(int i=0; i<jsonArray.size()-1;i++){
//              JSONObject jsonObject = jsonArray.getJSONObject(i);
//              Long goodsId = jsonObject.getLong("goodsId");
//             JSONObject itemRuleAllRespDTO = jsonObject.getJSONObject("itemRuleAllRespDTO");
//              JSONArray itemList = itemRuleAllRespDTO.getJSONArray("itemList");
//              for(int j =0 ; j<itemList.size() -1 ;j++){
//                   JSONObject jsonObject1 = itemList.getJSONObject(j);
//                   JSONObject skuLimitInfo = jsonObject1.getJSONObject("skuLimitInfo");
//                   if(Objects.isNull(skuLimitInfo)){
//                       ++k;
//                       set.add(goodsId);
//                   }
//              }
//         }
//        System.out.println(k);
//        System.out.println(JSON.toJSONString(set));


         tl.set(1234);
         Thread thread = new Thread(new Runnable() {
             @Override
             public void run() {
                 tl.set(2);
                 System.out.println(tl.get());
                 tl.remove();
                 System.out.println(tl.get());
             }
         });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tl.set(3);
                System.out.println(tl.get());
                tl.remove();
                System.out.println(tl.get());
            }
        });
        System.out.println( tl.get());
        thread.start();
        thread1.start();

        System.out.println( tl.get());
    }




    public  static String getstr(){
         StringBuffer sb = new StringBuffer();
         sb.append(
        "[\n" +
                "  {\n" +
                "    \"goodsId\": 1201981500173,\n" +
                "    \"goodsKey\": \"6001657119915:1201981500173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984316,\n" +
                "      \"goodsId\": 1201981500173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235670173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235670173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235680173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235680173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235690173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235690173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235700173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235700173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235710173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235710173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235720173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235720173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235730173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235730173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235740173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235740173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235750173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235750173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984316,\n" +
                "          \"itemId\": 1210235760173,\n" +
                "          \"itemLevelId\": 292596299,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210235760173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984316\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984316\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1201981500173,\n" +
                "      \"goodsIdVid\": \"1201981500173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/94754ca1ff6f4d1496cc902a50d29710.png\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/94754ca1ff6f4d1496cc902a50d29710.png\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1201981500173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 199,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"299\",\n" +
                "        \"minActivityPrice\": 199,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"299\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 0,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"718A70141\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 2,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 1,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101037\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101037\",\n" +
                "          \"skuId\": 1210235670173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101038\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101038\",\n" +
                "          \"skuId\": 1210235680173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101039\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101039\",\n" +
                "          \"skuId\": 1210235690173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101040\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101040\",\n" +
                "          \"skuId\": 1210235700173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101041\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101041\",\n" +
                "          \"skuId\": 1210235710173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101042\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101042\",\n" +
                "          \"skuId\": 1210235720173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101043\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101043\",\n" +
                "          \"skuId\": 1210235730173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101044\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101044\",\n" +
                "          \"skuId\": 1210235740173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101045\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101045\",\n" +
                "          \"skuId\": 1210235750173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707339173,\n" +
                "              \"specValueName\": \"45\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"45\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201981500173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718A7014101046\",\n" +
                "          \"salePrice\": \"299\",\n" +
                "          \"skuBarCode\": \"718A7014101046\",\n" +
                "          \"skuId\": 1210235760173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709033173,\n" +
                "              \"specValueName\": \"46\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"46\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707339173,\n" +
                "              \"specValueName\": \"45\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709033173,\n" +
                "              \"specValueName\": \"46\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"专柜春夏/柒牌商务短袖衬衫/718A70141\",\n" +
                "      \"totalGoodsNum\": 2,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 1200666520173,\n" +
                "    \"goodsKey\": \"6001657119915:1200666520173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984312,\n" +
                "      \"goodsId\": 1200666520173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856450173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856450173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856460173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856460173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856470173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856470173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856480173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856480173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856490173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856490173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856500173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856500173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856510173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856510173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856520173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856520173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856530173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856530173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984312,\n" +
                "          \"itemId\": 1202856540173,\n" +
                "          \"itemLevelId\": 292596814,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1202856540173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984312\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984312\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1200666520173,\n" +
                "      \"goodsIdVid\": \"1200666520173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/995111888d6e44edad60568ba983efee.jpg\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/995111888d6e44edad60568ba983efee.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/5efd81f0d4ff489a86738d908e5edb93.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/483bc94dc6fb429f84e16f7cfa7559b3.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1200666520173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 199,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"369\",\n" +
                "        \"minActivityPrice\": 199,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"369\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 5,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"C16A71330\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 5,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 1,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051037\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051037\",\n" +
                "          \"skuId\": 1202856450173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 5,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051038\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051038\",\n" +
                "          \"skuId\": 1202856460173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051039\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051039\",\n" +
                "          \"skuId\": 1202856470173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051040\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051040\",\n" +
                "          \"skuId\": 1202856480173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051041\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051041\",\n" +
                "          \"skuId\": 1202856490173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051042\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051042\",\n" +
                "          \"skuId\": 1202856500173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051043\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051043\",\n" +
                "          \"skuId\": 1202856510173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051044\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051044\",\n" +
                "          \"skuId\": 1202856520173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051045\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051045\",\n" +
                "          \"skuId\": 1202856530173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707339173,\n" +
                "              \"specValueName\": \"45\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"45\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1200666520173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7133051046\",\n" +
                "          \"salePrice\": \"369\",\n" +
                "          \"skuBarCode\": \"C16A7133051046\",\n" +
                "          \"skuId\": 1202856540173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709033173,\n" +
                "              \"specValueName\": \"46\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"46\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707339173,\n" +
                "              \"specValueName\": \"45\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709033173,\n" +
                "              \"specValueName\": \"46\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"柒牌春夏/专柜/1商务短袖衬衫/C16A71330\",\n" +
                "      \"totalGoodsNum\": 7,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 1202184860173,\n" +
                "    \"goodsKey\": \"6001657119915:1202184860173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984294,\n" +
                "      \"goodsId\": 1202184860173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210773990173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210773990173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774000173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774000173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774010173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774010173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774020173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774020173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774030173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774030173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774040173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774040173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774050173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774050173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774060173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774060173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774070173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774070173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774080173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774080173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774090173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774090173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774100173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774100173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774110173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774110173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774120173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774120173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774130173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774130173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774140173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774140173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774150173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774150173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984294,\n" +
                "          \"itemId\": 1210774160173,\n" +
                "          \"itemLevelId\": 292595248,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1210774160173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984294\n" +
                "        }\n" +
                "      ],\n" );
         sb.append(
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984294\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1202184860173,\n" +
                "      \"goodsIdVid\": \"1202184860173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/73ee756a8f854359a4216bc413ac6eb4.png\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/73ee756a8f854359a4216bc413ac6eb4.png\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1202184860173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 199,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"459\",\n" +
                "        \"minActivityPrice\": 199,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"459\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 0,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"716T78061\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 6,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 1,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101160\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101160\",\n" +
                "          \"skuId\": 1210773990173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101165\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101165\",\n" +
                "          \"skuId\": 1210774000173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101170\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101170\",\n" +
                "          \"skuId\": 1210774010173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101175\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101175\",\n" +
                "          \"skuId\": 1210774020173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101180\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101180\",\n" +
                "          \"skuId\": 1210774030173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101185\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101185\",\n" +
                "          \"skuId\": 1210774040173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101190\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101190\",\n" +
                "          \"skuId\": 1210774050173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101195\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101195\",\n" +
                "          \"skuId\": 1210774060173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806101200\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806101200\",\n" +
                "          \"skuId\": 1210774070173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米白\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172160\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172160\",\n" +
                "          \"skuId\": 1210774080173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172165\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172165\",\n" +
                "          \"skuId\": 1210774090173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172170\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172170\",\n" +
                "          \"skuId\": 1210774100173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172175\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172175\",\n" +
                "          \"skuId\": 1210774110173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172180\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172180\",\n" +
                "          \"skuId\": 1210774120173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172185\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172185\",\n" +
                "          \"skuId\": 1210774130173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172190\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172190\",\n" +
                "          \"skuId\": 1210774140173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172195\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172195\",\n" +
                "          \"skuId\": 1210774150173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1202184860173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"716T7806172200\",\n" +
                "          \"salePrice\": \"459\",\n" +
                "          \"skuBarCode\": \"716T7806172200\",\n" +
                "          \"skuId\": 1210774160173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4678910173,\n" +
                "              \"specValueName\": \"米白\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"柒牌春夏/短袖POLO衫/716T78061\",\n" +
                "      \"totalGoodsNum\": 6,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 1201188670173,\n" +
                "    \"goodsKey\": \"6001657119915:1201188670173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"beyondBuyWay\": 1,\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984273,\n" +
                "      \"goodsId\": 1201188670173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352190173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352190173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636139\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352200173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352200173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636140\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352210173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352210173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636142\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352220173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352220173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636143\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352230173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352230173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352240173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352240173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636146\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352250173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352250173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636148\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352260173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352260173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636149\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352270173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352270173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636150\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352280173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352280173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636152\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352290173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352290173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636153\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352300173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352300173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636154\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352310173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352310173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636156\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352320173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352320173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636157\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352330173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352330173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352340173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352340173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636160\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352350173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352350173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636161\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984273,\n" +
                "          \"itemId\": 1205352360173,\n" +
                "          \"itemLevelId\": 292595247,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"99\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1205352360173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1668654636162\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 1,\n" +
                "      \"updateTime\": 1668654636139\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1201188670173,\n" +
                "      \"goodsIdVid\": \"1201188670173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/3142598e7e63427093f092548b41c172.png\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/3142598e7e63427093f092548b41c172.png\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/eaa5bc124ce54041a583be6ce9110f4f.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1201188670173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 99,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"699\",\n" +
                "        \"minActivityPrice\": 99,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"699\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 1,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"C16A71290\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 9,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 1,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041160\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041160\",\n" +
                "          \"skuId\": 1205352190173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041165\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041165\",\n" +
                "          \"skuId\": 1205352200173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041170\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041170\",\n" +
                "          \"skuId\": 1205352210173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041175\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041175\",\n" +
                "          \"skuId\": 1205352220173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041180\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041180\",\n" +
                "          \"skuId\": 1205352230173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041185\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041185\",\n" +
                "          \"skuId\": 1205352240173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041190\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041190\",\n" +
                "          \"skuId\": 1205352250173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041195\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041195\",\n" +
                "          \"skuId\": 1205352260173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129041200\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129041200\",\n" +
                "          \"skuId\": 1205352270173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰绿\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051160\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051160\",\n" +
                "          \"skuId\": 1205352280173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051165\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051165\",\n" +
                "          \"skuId\": 1205352290173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051170\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051170\",\n" +
                "          \"skuId\": 1205352300173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051175\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051175\",\n" +
                "          \"skuId\": 1205352310173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051180\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051180\",\n" +
                "          \"skuId\": 1205352320173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051185\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051185\",\n" +
                "          \"skuId\": 1205352330173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051190\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051190\",\n" +
                "          \"skuId\": 1205352340173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051195\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051195\",\n" +
                "          \"skuId\": 1205352350173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 99,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201188670173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"C16A7129051200\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"C16A7129051200\",\n" +
                "          \"skuId\": 1205352360173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4709047173,\n" +
                "              \"specValueName\": \"灰绿\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"柒牌春夏/休闲短袖衬衫/C16A71290\",\n" +
                "      \"totalGoodsNum\": 9,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 78055790173,\n" +
                "    \"goodsKey\": \"6001657119915:78055790173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984250,\n" +
                "      \"goodsId\": 78055790173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454200173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454200173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454210173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454210173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454220173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454220173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454230173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454230173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454240173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454240173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454250173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454250173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454260173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454260173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454270173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454270173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454280173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454280173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454290173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454290173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454300173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454300173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454310173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454310173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454320173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454320173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454330173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454330173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454340173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454340173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454350173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454350173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454360173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454360173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454370173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454370173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454380173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454380173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454390173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454390173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454400173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454400173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454410173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454410173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454420173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454420173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454430173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454430173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454440173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454440173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454450173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454450173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984250,\n" +
                "          \"itemId\": 365454460173,\n" +
                "          \"itemLevelId\": 292596327,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365454460173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984250\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984250\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 78055790173,\n" +
                "      \"goodsIdVid\": \"78055790173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/6ac7ea76536c456cae6a09978bdb0554.jpg\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/6ac7ea76536c456cae6a09978bdb0554.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/dfdb2da0b4514b1fae2bc1a63c093adb.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/604eb5ca6b4e4a0fa4fb32a9bf9eda32.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/db282829e6734b09be94018090d321bb.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/ec216065dfb94beab34269948de21035.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/d165d147fe9540ddb26efcc7eedaad8d.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 78055790173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 199,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"559\",\n" +
                "        \"minActivityPrice\": 199,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"559\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 0,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"K18T70840\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 3,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 3,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009160\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009160\",\n" +
                "          \"skuId\": 365454200173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009165\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009165\",\n" +
                "          \"skuId\": 365454210173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009170\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009170\",\n" +
                "          \"skuId\": 365454220173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009175\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009175\",\n" +
                "          \"skuId\": 365454230173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009180\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009180\",\n" +
                "          \"skuId\": 365454240173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009185\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009185\",\n" +
                "          \"skuId\": 365454250173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009190\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009190\",\n" +
                "          \"skuId\": 365454260173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009195\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009195\",\n" +
                "          \"skuId\": 365454270173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084009200\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084009200\",\n" +
                "          \"skuId\": 365454280173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016160\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016160\",\n" +
                "          \"skuId\": 365454290173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016165\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016165\",\n" +
                "          \"skuId\": 365454300173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016170\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016170\",\n" +
                "          \"skuId\": 365454310173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016175\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016175\",\n" +
                "          \"skuId\": 365454320173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016180\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016180\",\n" +
                "          \"skuId\": 365454330173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016185\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016185\",\n" +
                "          \"skuId\": 365454340173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016190\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016190\",\n" +
                "          \"skuId\": 365454350173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016195\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016195\",\n" +
                "          \"skuId\": 365454360173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084016200\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084016200\",\n" +
                "          \"skuId\": 365454370173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大红\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072160\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072160\",\n" +
                "          \"skuId\": 365454380173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072165\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072165\",\n" +
                "          \"skuId\": 365454390173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072170\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072170\",\n" +
                "          \"skuId\": 365454400173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072175\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072175\",\n" +
                "          \"skuId\": 365454410173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072180\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072180\",\n" +
                "          \"skuId\": 365454420173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072185\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072185\",\n" +
                "          \"skuId\": 365454430173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072190\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072190\",\n" +
                "          \"skuId\": 365454440173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072195\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072195\",\n" +
                "          \"skuId\": 365454450173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" );
         sb.append(
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78055790173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"K18T7084072200\",\n" +
                "          \"salePrice\": \"559\",\n" +
                "          \"skuBarCode\": \"K18T7084072200\",\n" +
                "          \"skuId\": 365454460173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4711628173,\n" +
                "              \"specValueName\": \"大红\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"专柜春夏/柒牌短袖T恤/K18T70840\",\n" +
                "      \"totalGoodsNum\": 4,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 1302962490173,\n" +
                "    \"goodsKey\": \"6001657119915:1302962490173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984237,\n" +
                "      \"goodsId\": 1302962490173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012330173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012340173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012350173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012360173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012370173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012380173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012390173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012400173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012410173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012420173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012430173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012440173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012450173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012450173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012460173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012460173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012470173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012470173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012480173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012480173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012490173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012490173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012500173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012500173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012510173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012510173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012520173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012520173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012530173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012530173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012540173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012540173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012550173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012550173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012560173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012560173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012570173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012570173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012580173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012580173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012590173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012590173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012600173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012600173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012610173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012610173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012620173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012620173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012630173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012630173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012640173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012640173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012650173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012660173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012670173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012680173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012690173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012700173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012710173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012720173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012730173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012740173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012750173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012760173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012770173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012780173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012790173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012800173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012810173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012820173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012830173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012840173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012850173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012850173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012860173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012860173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012870173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012870173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012880173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012880173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012890173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012890173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012900173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012900173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012910173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012910173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012920173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012920173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012930173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012930173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012940173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012940173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012950173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012950173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012960173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012960173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012970173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012970173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012980173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012980173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792012990173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792012990173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013000173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792013000173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013010173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792013010173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013020173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792013020173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013030173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792013030173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013040173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1792013040173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013050173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013060173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013070173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013080173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013090173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013100173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013110173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013120173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013130173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013140173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013150173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013160173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013170173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013180173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013190173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013200173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013210173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013220173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013230173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984237,\n" +
                "          \"itemId\": 1792013240173,\n" +
                "          \"itemLevelId\": 292596298,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"259\",\n" +
                "          \"updateTime\": 1667186984237\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984237\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1302962490173,\n" +
                "      \"goodsIdVid\": \"1302962490173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/108f220a7c4d41668689b695a0f99b51.jpg\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/108f220a7c4d41668689b695a0f99b51.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/b8fdc1fc2e4d4695964409ff81483ae1.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/a2b36e414d8045db8a5e662976dd5e65.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1302962490173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 259,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"469\",\n" +
                "        \"minActivityPrice\": 259,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"469\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 28,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"F20H70090\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 1,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 3,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006026\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006026\",\n" +
                "          \"skuId\": 1792012330173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006027\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006027\",\n" +
                "          \"skuId\": 1792012340173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006028\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006028\",\n" +
                "          \"skuId\": 1792012350173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006029\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006029\",\n" +
                "          \"skuId\": 1792012360173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006030\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006030\",\n" +
                "          \"skuId\": 1792012370173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006031\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006031\",\n" +
                "          \"skuId\": 1792012380173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006032\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006032\",\n" +
                "          \"skuId\": 1792012390173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006033\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006033\",\n" +
                "          \"skuId\": 1792012400173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006034\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006034\",\n" +
                "          \"skuId\": 1792012410173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006035\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006035\",\n" +
                "          \"skuId\": 1792012420173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006036\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006036\",\n" +
                "          \"skuId\": 1792012430173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006037\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006037\",\n" +
                "          \"skuId\": 1792012440173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006038\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006038\",\n" +
                "          \"skuId\": 1792012450173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006039\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006039\",\n" +
                "          \"skuId\": 1792012460173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006040\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006040\",\n" +
                "          \"skuId\": 1792012470173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006041\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006041\",\n" +
                "          \"skuId\": 1792012480173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006042\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006042\",\n" +
                "          \"skuId\": 1792012490173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006043\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006043\",\n" +
                "          \"skuId\": 1792012500173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006044\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006044\",\n" +
                "          \"skuId\": 1792012510173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006130\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006130\",\n" +
                "          \"skuId\": 1792012520173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006132\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006132\",\n" +
                "          \"skuId\": 1792012530173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006134\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006134\",\n" +
                "          \"skuId\": 1792012540173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009006136\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009006136\",\n" +
                "          \"skuId\": 1792012550173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"中灰\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009026\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009026\",\n" +
                "          \"skuId\": 1792012560173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009027\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009027\",\n" +
                "          \"skuId\": 1792012570173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009028\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009028\",\n" +
                "          \"skuId\": 1792012580173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009029\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009029\",\n" +
                "          \"skuId\": 1792012590173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009030\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009030\",\n" +
                "          \"skuId\": 1792012600173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009031\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009031\",\n" +
                "          \"skuId\": 1792012610173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009032\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009032\",\n" +
                "          \"skuId\": 1792012620173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009033\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009033\",\n" +
                "          \"skuId\": 1792012630173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009034\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009034\",\n" +
                "          \"skuId\": 1792012640173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009035\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009035\",\n" +
                "          \"skuId\": 1792012650173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009036\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009036\",\n" +
                "          \"skuId\": 1792012660173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009037\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009037\",\n" +
                "          \"skuId\": 1792012670173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009038\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009038\",\n" +
                "          \"skuId\": 1792012680173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009039\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009039\",\n" +
                "          \"skuId\": 1792012690173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009040\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009040\",\n" +
                "          \"skuId\": 1792012700173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009041\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009041\",\n" +
                "          \"skuId\": 1792012710173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009042\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009042\",\n" +
                "          \"skuId\": 1792012720173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009043\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009043\",\n" +
                "          \"skuId\": 1792012730173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009044\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009044\",\n" +
                "          \"skuId\": 1792012740173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009130\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009130\",\n" +
                "          \"skuId\": 1792012750173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009132\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009132\",\n" +
                "          \"skuId\": 1792012760173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009134\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009134\",\n" +
                "          \"skuId\": 1792012770173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009009136\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009009136\",\n" +
                "          \"skuId\": 1792012780173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036026\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036026\",\n" +
                "          \"skuId\": 1792012790173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036027\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036027\",\n" +
                "          \"skuId\": 1792012800173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036028\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036028\",\n" +
                "          \"skuId\": 1792012810173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036029\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036029\",\n" +
                "          \"skuId\": 1792012820173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036030\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036030\",\n" +
                "          \"skuId\": 1792012830173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036031\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036031\",\n" +
                "          \"skuId\": 1792012840173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036032\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036032\",\n" +
                "          \"skuId\": 1792012850173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036033\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036033\",\n" +
                "          \"skuId\": 1792012860173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036034\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036034\",\n" +
                "          \"skuId\": 1792012870173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036035\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036035\",\n" +
                "          \"skuId\": 1792012880173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036036\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036036\",\n" +
                "          \"skuId\": 1792012890173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036037\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036037\",\n" +
                "          \"skuId\": 1792012900173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036038\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036038\",\n" +
                "          \"skuId\": 1792012910173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036039\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036039\",\n" +
                "          \"skuId\": 1792012920173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036040\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036040\",\n" +
                "          \"skuId\": 1792012930173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036041\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036041\",\n" +
                "          \"skuId\": 1792012940173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036042\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036042\",\n" +
                "          \"skuId\": 1792012950173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036043\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036043\",\n" +
                "          \"skuId\": 1792012960173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036044\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036044\",\n" +
                "          \"skuId\": 1792012970173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036130\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036130\",\n" +
                "          \"skuId\": 1792012980173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036132\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036132\",\n" +
                "          \"skuId\": 1792012990173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036134\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036134\",\n" +
                "          \"skuId\": 1792013000173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009036136\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009036136\",\n" +
                "          \"skuId\": 1792013010173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"驼色\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059026\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059026\",\n" +
                "          \"skuId\": 1792013020173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059027\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059027\",\n" +
                "          \"skuId\": 1792013030173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 3,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059028\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059028\",\n" +
                "          \"skuId\": 1792013040173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 4,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059029\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059029\",\n" +
                "          \"skuId\": 1792013050173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059030\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059030\",\n" +
                "          \"skuId\": 1792013060173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059031\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059031\",\n" +
                "          \"skuId\": 1792013070173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059032\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059032\",\n" +
                "          \"skuId\": 1792013080173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 8,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059033\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059033\",\n" +
                "          \"skuId\": 1792013090173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059034\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059034\",\n" +
                "          \"skuId\": 1792013100173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 2,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059035\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059035\",\n" +
                "          \"skuId\": 1792013110173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059036\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059036\",\n" +
                "          \"skuId\": 1792013120173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059037\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059037\",\n" +
                "          \"skuId\": 1792013130173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059038\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059038\",\n" +
                "          \"skuId\": 1792013140173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059039\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059039\",\n" +
                "          \"skuId\": 1792013150173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059040\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059040\",\n" +
                "          \"skuId\": 1792013160173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059041\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059041\",\n" +
                "          \"skuId\": 1792013170173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059042\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059042\",\n" +
                "          \"skuId\": 1792013180173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059043\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059043\",\n" +
                "          \"skuId\": 1792013190173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059044\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059044\",\n" +
                "          \"skuId\": 1792013200173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 3,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059130\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059130\",\n" +
                "          \"skuId\": 1792013210173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 4,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059132\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059132\",\n" +
                "          \"skuId\": 1792013220173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 4,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059134\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059134\",\n" +
                "          \"skuId\": 1792013230173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 259,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1302962490173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"F20H7009059136\",\n" +
                "          \"salePrice\": \"469\",\n" +
                "          \"skuBarCode\": \"F20H7009059136\",\n" +
                "          \"skuId\": 1792013240173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4714739173,\n" +
                "              \"specValueName\": \"中灰\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 6703684173,\n" +
                "              \"specValueName\": \"驼色\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"柒牌春夏/休闲梭织长裤/F20H70090\",\n" +
                "      \"totalGoodsNum\": 1,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 1210158850173,\n" +
                "    \"goodsKey\": \"6001657119915:1210158850173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984216,\n" +
                "      \"goodsId\": 1210158850173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675920173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675920173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675930173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675930173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675940173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675940173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675950173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675950173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675960173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675960173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675970173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675970173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675980173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675980173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249675990173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249675990173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676000173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676000173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676010173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676010173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676020173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676020173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676030173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676030173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676040173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676040173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676050173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676050173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676060173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676060173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676070173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676070173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676080173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676080173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676090173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676090173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676100173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676100173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676110173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676110173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676120173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676120173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676130173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676130173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676140173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676140173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676150173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676150173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676160173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676160173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676170173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676170173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676180173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676180173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676190173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676190173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676200173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676200173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676210173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676210173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676220173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676220173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676230173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676230173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676240173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676240173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676250173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676250173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676260173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676260173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984216,\n" +
                "          \"itemId\": 1249676270173,\n" +
                "          \"itemLevelId\": 292595491,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"199\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1249676270173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984216\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984216\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1210158850173,\n" +
                "      \"goodsIdVid\": \"1210158850173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/7d605a07a7ca4964b03afcdda5dc19fa.png\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/7d605a07a7ca4964b03afcdda5dc19fa.png\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/9e3bdf1c11664c9490db14b6fab12367.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/7c4d56b9939e4366862ac5cd46f79c80.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/b70f945a2226464faa72534dbc0e364c.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1210158850173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 199,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"399\",\n" +
                "        \"minActivityPrice\": 199,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"399\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 10,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"X18T71410\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 11,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 3,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040160\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040160\",\n" +
                "          \"skuId\": 1249675920173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040165\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040165\",\n" +
                "          \"skuId\": 1249675930173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040170\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040170\",\n" +
                "          \"skuId\": 1249675940173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040175\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040175\",\n" +
                "          \"skuId\": 1249675950173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040180\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040180\",\n" +
                "          \"skuId\": 1249675960173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 3,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040185\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040185\",\n" +
                "          \"skuId\": 1249675970173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040190\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040190\",\n" +
                "          \"skuId\": 1249675980173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040195\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040195\",\n" +
                "          \"skuId\": 1249675990173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141040200\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141040200\",\n" +
                "          \"skuId\": 1249676000173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"薄荷绿\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050160\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050160\",\n" +
                "          \"skuId\": 1249676010173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050165\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050165\",\n" +
                "          \"skuId\": 1249676020173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050170\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050170\",\n" +
                "          \"skuId\": 1249676030173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050175\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050175\",\n" +
                "          \"skuId\": 1249676040173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050180\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050180\",\n" +
                "          \"skuId\": 1249676050173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050185\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050185\",\n" +
                "          \"skuId\": 1249676060173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050190\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050190\",\n" +
                "          \"skuId\": 1249676070173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050195\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050195\",\n" +
                "          \"skuId\": 1249676080173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141050200\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141050200\",\n" +
                "          \"skuId\": 1249676090173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"天蓝\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059160\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059160\",\n" +
                "          \"skuId\": 1249676100173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 4,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059165\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059165\",\n" +
                "          \"skuId\": 1249676110173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059170\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059170\",\n" +
                "          \"skuId\": 1249676120173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059175\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059175\",\n" +
                "          \"skuId\": 1249676130173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059180\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059180\",\n" +
                "          \"skuId\": 1249676140173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059185\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059185\",\n" +
                "          \"skuId\": 1249676150173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059190\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059190\",\n" +
                "          \"skuId\": 1249676160173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059195\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059195\",\n" +
                "          \"skuId\": 1249676170173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141059200\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141059200\",\n" +
                "          \"skuId\": 1249676180173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072160\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072160\",\n" +
                "          \"skuId\": 1249676190173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072165\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072165\",\n" +
                "          \"skuId\": 1249676200173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072170\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072170\",\n" +
                "          \"skuId\": 1249676210173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072175\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072175\",\n" +
                "          \"skuId\": 1249676220173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072180\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072180\",\n" +
                "          \"skuId\": 1249676230173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 2,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072185\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072185\",\n" +
                "          \"skuId\": 1249676240173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072190\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072190\",\n" +
                "          \"skuId\": 1249676250173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072195\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072195\",\n" +
                "          \"skuId\": 1249676260173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 199,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1210158850173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"X18T7141072200\",\n" +
                "          \"salePrice\": \"399\",\n" +
                "          \"skuBarCode\": \"X18T7141072200\",\n" +
                "          \"skuId\": 1249676270173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"大白\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4708801173,\n" +
                "              \"specValueName\": \"薄荷绿\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707338173,\n" +
                "              \"specValueName\": \"天蓝\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679292173,\n" +
                "              \"specValueName\": \"大白\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"春夏专柜/柒牌短袖POLO衫/X18T71410\",\n" +
                "      \"totalGoodsNum\": 13,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 83412220173,\n" +
                "    \"goodsKey\": \"6001657119915:83412220173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984173,\n" +
                "      \"goodsId\": 83412220173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410370173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410370173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410380173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410380173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410390173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410390173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410400173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410400173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410410173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410410173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410420173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410420173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410430173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410430173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410440173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410440173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410450173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410450173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984173,\n" +
                "          \"itemId\": 436410460173,\n" +
                "          \"itemLevelId\": 292596365,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 436410460173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984173\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984173\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 83412220173,\n" +
                "      \"goodsIdVid\": \"83412220173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/ce0eb591dc864e658a861a304392fe79.jpg\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/ce0eb591dc864e658a861a304392fe79.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/88694dea263144ad81e76aa5a5e9a12c.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/117d955487ab4d24b7783689bf10e294.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 83412220173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 299,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"580\",\n" +
                "        \"minActivityPrice\": 299,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"580\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 8,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"M18H71940\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 2,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 3,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009001\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009001\",\n" +
                "          \"skuId\": 436410370173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4719737173,\n" +
                "              \"specValueName\": \"XS\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"XS\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009002\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009002\",\n" +
                "          \"skuId\": 436410380173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679428173,\n" +
                "              \"specValueName\": \"S\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"S\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 6,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009003\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009003\",\n" +
                "          \"skuId\": 436410390173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678338173,\n" +
                "              \"specValueName\": \"M\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"M\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009004\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009004\",\n" +
                "          \"skuId\": 436410400173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679142173,\n" +
                "              \"specValueName\": \"L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009005\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009005\",\n" +
                "          \"skuId\": 436410410173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679625173,\n" +
                "              \"specValueName\": \"XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"XL\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009006\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009006\",\n" +
                "          \"skuId\": 436410420173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679162173,\n" +
                "              \"specValueName\": \"2XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"2XL\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009007\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009007\",\n" +
                "          \"skuId\": 436410430173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679441173,\n" +
                "              \"specValueName\": \"3XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"3XL\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009008\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009008\",\n" +
                "          \"skuId\": 436410440173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679667173,\n" +
                "              \"specValueName\": \"4XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"4XL\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009009\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009009\",\n" +
                "          \"skuId\": 436410450173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4720072173,\n" +
                "              \"specValueName\": \"5XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"5XL\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 83412220173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"M18H7194009010\",\n" +
                "          \"salePrice\": \"580\",\n" +
                "          \"skuBarCode\": \"M18H7194009010\",\n" +
                "          \"skuId\": 436410460173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4720291173,\n" +
                "              \"specValueName\": \"6XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"黑色\\\",\\\"尺码\\\":\\\"6XL\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4585160173,\n" +
                "              \"specValueName\": \"黑色\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4719737173,\n" +
                "              \"specValueName\": \"XS\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679428173,\n" +
                "              \"specValueName\": \"S\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678338173,\n" +
                "              \"specValueName\": \"M\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679142173,\n" +
                "              \"specValueName\": \"L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679625173,\n" +
                "              \"specValueName\": \"XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679162173,\n" +
                "              \"specValueName\": \"2XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679441173,\n" +
                "              \"specValueName\": \"3XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679667173,\n" +
                "              \"specValueName\": \"4XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4720072173,\n" +
                "              \"specValueName\": \"5XL\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4720291173,\n" +
                "              \"specValueName\": \"6XL\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"春夏/中华立领便装长裤/M18H71940\",\n" +
                "      \"totalGoodsNum\": 3,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 78043950173,\n" +
                "    \"goodsKey\": \"6001657119915:78043950173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984158,\n" +
                "      \"goodsId\": 78043950173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508360173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508360173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508370173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508370173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508380173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508380173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508390173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508390173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508400173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508400173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508410173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508410173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508420173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508420173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508430173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508430173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508440173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508440173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508450173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508450173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508460173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508460173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508470173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508470173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508480173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508480173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508490173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508490173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508500173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508500173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508510173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508510173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508520173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508520173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508530173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508530173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508540173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508540173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508550173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508550173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508560173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508560173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508570173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508570173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508580173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508580173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508590173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508590173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508600173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508600173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508610173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508610173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508620173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508620173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508630173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508630173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508640173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508640173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508650173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508650173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508660173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508660173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508670173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508670173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508680173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508680173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508690173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508690173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508700173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508700173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508710173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508710173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508720173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508720173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508730173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508730173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508740173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508740173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508750173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508750173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508760173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508760173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508770173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508770173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508780173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508780173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508790173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508790173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508800173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508800173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508810173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508810173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508820173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508820173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508830173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508830173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508840173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508840173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508850173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508850173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508860173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508860173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508870173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508870173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508880173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508880173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508890173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508890173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508900173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508900173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508910173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508910173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508920173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508920173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508930173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508930173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508940173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508940173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508950173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508950173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508960173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508960173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508970173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508970173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508980173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508980173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365508990173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365508990173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365509000173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365509000173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365509010173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365509010173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365509020173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365509020173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365509030173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365509030173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984158,\n" +
                "          \"itemId\": 365509040173,\n" +
                "          \"itemLevelId\": 292596178,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"299\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 365509040173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984158\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984158\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 2,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 78043950173,\n" +
                "      \"goodsIdVid\": \"78043950173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/2b12012eff474795a348712b7bacee43.jpg\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/2b12012eff474795a348712b7bacee43.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/54cb3768426b4b41b21ffc6a94b5fce6.jpg\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 78043950173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 299,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"699\",\n" +
                "        \"minActivityPrice\": 299,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"699\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 20,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"718H71560\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 3,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 1,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003026\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003026\",\n" +
                "          \"skuId\": 365508360173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003027\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003027\",\n" +
                "          \"skuId\": 365508370173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003028\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003028\",\n" +
                "          \"skuId\": 365508380173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003029\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003029\",\n" +
                "          \"skuId\": 365508390173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 2,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003030\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003030\",\n" +
                "          \"skuId\": 365508400173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003031\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003031\",\n" +
                "          \"skuId\": 365508410173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003032\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003032\",\n" +
                "          \"skuId\": 365508420173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003033\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003033\",\n" +
                "          \"skuId\": 365508430173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 2,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003034\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003034\",\n" +
                "          \"skuId\": 365508440173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 3,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003035\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003035\",\n" +
                "          \"skuId\": 365508450173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 4,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003036\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003036\",\n" +
                "          \"skuId\": 365508460173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003037\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003037\",\n" +
                "          \"skuId\": 365508470173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003038\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003038\",\n" +
                "          \"skuId\": 365508480173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003039\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003039\",\n" +
                "          \"skuId\": 365508490173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003040\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003040\",\n" +
                "          \"skuId\": 365508500173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003041\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003041\",\n" +
                "          \"skuId\": 365508510173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003042\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003042\",\n" +
                "          \"skuId\": 365508520173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003043\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003043\",\n" +
                "          \"skuId\": 365508530173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003044\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003044\",\n" +
                "          \"skuId\": 365508540173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003130\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003130\",\n" +
                "          \"skuId\": 365508550173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003132\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003132\",\n" +
                "          \"skuId\": 365508560173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 5,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003134\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003134\",\n" +
                "          \"skuId\": 365508570173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156003136\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156003136\",\n" +
                "          \"skuId\": 365508580173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"米灰\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051026\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051026\",\n" +
                "          \"skuId\": 365508590173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051027\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051027\",\n" +
                "          \"skuId\": 365508600173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051028\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051028\",\n" +
                "          \"skuId\": 365508610173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051029\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051029\",\n" +
                "          \"skuId\": 365508620173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051030\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051030\",\n" +
                "          \"skuId\": 365508630173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051031\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051031\",\n" +
                "          \"skuId\": 365508640173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051032\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051032\",\n" +
                "          \"skuId\": 365508650173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051033\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051033\",\n" +
                "          \"skuId\": 365508660173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051034\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051034\",\n" +
                "          \"skuId\": 365508670173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051035\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051035\",\n" +
                "          \"skuId\": 365508680173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051036\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051036\",\n" +
                "          \"skuId\": 365508690173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051037\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051037\",\n" +
                "          \"skuId\": 365508700173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051038\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051038\",\n" +
                "          \"skuId\": 365508710173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051039\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051039\",\n" +
                "          \"skuId\": 365508720173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051040\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051040\",\n" +
                "          \"skuId\": 365508730173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051041\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051041\",\n" +
                "          \"skuId\": 365508740173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051042\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051042\",\n" +
                "          \"skuId\": 365508750173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051043\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051043\",\n" +
                "          \"skuId\": 365508760173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051044\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051044\",\n" +
                "          \"skuId\": 365508770173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051130\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051130\",\n" +
                "          \"skuId\": 365508780173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051132\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051132\",\n" +
                "          \"skuId\": 365508790173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051134\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051134\",\n" +
                "          \"skuId\": 365508800173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156051136\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156051136\",\n" +
                "          \"skuId\": 365508810173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"灰蓝\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059026\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059026\",\n" +
                "          \"skuId\": 365508820173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"26\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059027\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059027\",\n" +
                "          \"skuId\": 365508830173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"27\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059028\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059028\",\n" +
                "          \"skuId\": 365508840173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"28\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059029\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059029\",\n" +
                "          \"skuId\": 365508850173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"29\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059030\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059030\",\n" +
                "          \"skuId\": 365508860173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"30\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059031\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059031\",\n" +
                "          \"skuId\": 365508870173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"31\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059032\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059032\",\n" +
                "          \"skuId\": 365508880173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"32\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059033\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059033\",\n" +
                "          \"skuId\": 365508890173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"33\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059034\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059034\",\n" +
                "          \"skuId\": 365508900173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"34\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059035\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059035\",\n" +
                "          \"skuId\": 365508910173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"35\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059036\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059036\",\n" +
                "          \"skuId\": 365508920173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"36\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059037\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059037\",\n" +
                "          \"skuId\": 365508930173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"37\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059038\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059038\",\n" +
                "          \"skuId\": 365508940173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"38\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059039\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059039\",\n" +
                "          \"skuId\": 365508950173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"39\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059040\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059040\",\n" +
                "          \"skuId\": 365508960173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"40\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059041\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059041\",\n" +
                "          \"skuId\": 365508970173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"41\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059042\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059042\",\n" +
                "          \"skuId\": 365508980173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"42\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059043\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059043\",\n" +
                "          \"skuId\": 365508990173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"43\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059044\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059044\",\n" +
                "          \"skuId\": 365509000173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"44\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059130\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059130\",\n" +
                "          \"skuId\": 365509010173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"30L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059132\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059132\",\n" +
                "          \"skuId\": 365509020173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"32L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059134\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059134\",\n" +
                "          \"skuId\": 365509030173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"34L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 299,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 78043950173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"718H7156059136\",\n" +
                "          \"salePrice\": \"699\",\n" +
                "          \"skuBarCode\": \"718H7156059136\",\n" +
                "          \"skuId\": 365509040173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"藏青\\\",\\\"尺码\\\":\\\"36L\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4713262173,\n" +
                "              \"specValueName\": \"米灰\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708804173,\n" +
                "              \"specValueName\": \"灰蓝\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708631173,\n" +
                "              \"specValueName\": \"藏青\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4708530173,\n" +
                "              \"specValueName\": \"26\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708636173,\n" +
                "              \"specValueName\": \"27\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709015173,\n" +
                "              \"specValueName\": \"28\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707321173,\n" +
                "              \"specValueName\": \"29\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707563173,\n" +
                "              \"specValueName\": \"30\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707894173,\n" +
                "              \"specValueName\": \"31\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708060173,\n" +
                "              \"specValueName\": \"32\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707895173,\n" +
                "              \"specValueName\": \"33\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708532173,\n" +
                "              \"specValueName\": \"34\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707896173,\n" +
                "              \"specValueName\": \"35\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707564173,\n" +
                "              \"specValueName\": \"36\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707565173,\n" +
                "              \"specValueName\": \"37\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708533173,\n" +
                "              \"specValueName\": \"38\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709017173,\n" +
                "              \"specValueName\": \"39\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708057173,\n" +
                "              \"specValueName\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707717173,\n" +
                "              \"specValueName\": \"41\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708531173,\n" +
                "              \"specValueName\": \"42\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707561173,\n" +
                "              \"specValueName\": \"43\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707718173,\n" +
                "              \"specValueName\": \"44\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4707893173,\n" +
                "              \"specValueName\": \"30L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708058173,\n" +
                "              \"specValueName\": \"32L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4709016173,\n" +
                "              \"specValueName\": \"34L\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708059173,\n" +
                "              \"specValueName\": \"36L\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"专柜春夏/柒牌休闲梭织长裤/718H71560\",\n" +
                "      \"totalGoodsNum\": 4,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"goodsId\": 1201320050173,\n" +
                "    \"goodsKey\": \"6001657119915:1201320050173\",\n" +
                "    \"itemRuleAllRespDTO\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"createTime\": 1667186984145,\n" +
                "      \"goodsId\": 1201320050173,\n" +
                "      \"itemList\": [\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184130173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184130173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184140173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184140173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184150173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184150173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184160173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184160173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184170173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184170173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184180173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184180173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184190173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184190173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184200173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184200173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184210173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184210173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184220173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184220173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184230173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184230173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184240173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184240173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184250173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184250173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184260173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184260173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184270173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184270173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184280173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184280173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184290173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184290173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        },\n" +
                "        {\n" +
                "          \"conditionType\": 101,\n" +
                "          \"conditionValue\": \"0\",\n" +
                "          \"createTime\": 1667186984145,\n" +
                "          \"itemId\": 1206184300173,\n" +
                "          \"itemLevelId\": 292596452,\n" +
                "          \"priority\": 1,\n" +
                "          \"resultType\": 1003,\n" +
                "          \"resultValue\": \"159\",\n" +
                "          \"skuLimitInfo\": {\n" +
                "            \"canBuyNum\": 50,\n" +
                "            \"limitBizId\": 1206184300173,\n" +
                "            \"limitBizType\": 3,\n" +
                "            \"limitType\": 2,\n" +
                "            \"totalLimitNum\": 50,\n" +
                "            \"totalSoldNum\": 0\n" +
                "          },\n" +
                "          \"updateTime\": 1667186984145\n" +
                "        }\n" +
                "      ],\n" +
                "      \"itemSource\": 1,\n" +
                "      \"itemType\": 2,\n" +
                "      \"merchantId\": 2000083428915,\n" +
                "      \"sort\": 0,\n" +
                "      \"sourceProductId\": 145,\n" +
                "      \"sourceProductInstanceId\": 3676836915,\n" +
                "      \"sourceProductVersionId\": 12010,\n" +
                "      \"tcode\": \"weimob\",\n" +
                "      \"truncType\": 3,\n" +
                "      \"updateTime\": 1667186984145\n" +
                "    },\n" +
                "    \"promotionGoodsDTO\": {\n" +
                "      \"abilityCodeList\": [\n" +
                "        \"3001\"\n" +
                "      ],\n" +
                "      \"createVid\": 6001062998915,\n" +
                "      \"deductStockType\": 1,\n" +
                "      \"deliveryTypeList\": [\n" +
                "        1\n" +
                "      ],\n" +
                "      \"goodsId\": 1201320050173,\n" +
                "      \"goodsIdVid\": \"1201320050173-6001657119915\",\n" +
                "      \"goodsPicDTO\": {\n" +
                "        \"defaultPicUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/e4403c183bc74bfb9a1472f4090659bd.png\",\n" +
                "        \"picList\": [\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/e4403c183bc74bfb9a1472f4090659bd.png\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/51e0fdcb992241c2831a33495273b37e.jpg\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"picUrl\": \"https://image-c.weimobwmc.com/saas-wxbiz/2ba819d3458744f5ab3d386f36b17012.png\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"relationId\": 1201320050173,\n" +
                "        \"relationType\": 1\n" +
                "      },\n" +
                "      \"goodsPriceDTO\": {\n" +
                "        \"maxActivityPrice\": 159,\n" +
                "        \"maxCostPrice\": 0,\n" +
                "        \"maxSalePrice\": \"759\",\n" +
                "        \"minActivityPrice\": 159,\n" +
                "        \"minCostPrice\": 0,\n" +
                "        \"minSalePrice\": \"759\"\n" +
                "      },\n" +
                "      \"goodsStockNum\": 1,\n" +
                "      \"goodsType\": 1,\n" +
                "      \"initialSaleNum\": 0,\n" +
                "      \"isAssigned\": true,\n" +
                "      \"isCanSell\": true,\n" +
                "      \"isDeleted\": false,\n" +
                "      \"isMultiSku\": true,\n" +
                "      \"isOnline\": true,\n" +
                "      \"outerGoodsCode\": \"714T52110\",\n" +
                "      \"outerGoodsId\": \"\",\n" +
                "      \"payGoodsNum\": 0,\n" +
                "      \"payTypeList\": [\n" +
                "        1,\n" +
                "        2\n" +
                "      ],\n" +
                "      \"preGoodsStockNum\": 0,\n" +
                "      \"saleChannelType\": 1,\n" +
                "      \"sellModelType\": 1,\n" +
                "      \"skuDTOList\": [\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012160\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012160\",\n" +
                "          \"skuId\": 1206184130173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012165\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012165\",\n" +
                "          \"skuId\": 1206184140173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 1,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012170\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012170\",\n" +
                "          \"skuId\": 1206184150173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012175\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012175\",\n" +
                "          \"skuId\": 1206184160173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012180\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012180\",\n" +
                "          \"skuId\": 1206184170173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012185\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012185\",\n" +
                "          \"skuId\": 1206184180173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" );
         sb.append(
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012190\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012190\",\n" +
                "          \"skuId\": 1206184190173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012195\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012195\",\n" +
                "          \"skuId\": 1206184200173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211012200\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211012200\",\n" +
                "          \"skuId\": 1206184210173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"桃红\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054160\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054160\",\n" +
                "          \"skuId\": 1206184220173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"160\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054165\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054165\",\n" +
                "          \"skuId\": 1206184230173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"165\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054170\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054170\",\n" +
                "          \"skuId\": 1206184240173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"170\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054175\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054175\",\n" +
                "          \"skuId\": 1206184250173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"175\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054180\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054180\",\n" +
                "          \"skuId\": 1206184260173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"180\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054185\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054185\",\n" +
                "          \"skuId\": 1206184270173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"185\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054190\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054190\",\n" +
                "          \"skuId\": 1206184280173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"190\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054195\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054195\",\n" +
                "          \"skuId\": 1206184290173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"195\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        },\n" +
                "        {\n" +
                "          \"activityPrice\": 159,\n" +
                "          \"availableStockNum\": 0,\n" +
                "          \"costPrice\": 0,\n" +
                "          \"currency\": 1,\n" +
                "          \"goodsId\": 1201320050173,\n" +
                "          \"isDisabled\": false,\n" +
                "          \"isSelected\": true,\n" +
                "          \"outerSkuCode\": \"714T5211054200\",\n" +
                "          \"salePrice\": \"759\",\n" +
                "          \"skuBarCode\": \"714T5211054200\",\n" +
                "          \"skuId\": 1206184300173,\n" +
                "          \"skuPreStockNum\": 0,\n" +
                "          \"skuSpecList\": [\n" +
                "            {\n" +
                "              \"name\": \"尺码\",\n" +
                "              \"specId\": 742769173,\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"name\": \"颜色\",\n" +
                "              \"specId\": 57000,\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ],\n" +
                "          \"title\": \"{\\\"颜色\\\":\\\"孔雀蓝\\\",\\\"尺码\\\":\\\"200\\\"}\",\n" +
                "          \"vid\": 6001657119915\n" +
                "        }\n" +
                "      ],\n" +
                "      \"soldType\": 1,\n" +
                "      \"source\": 1,\n" +
                "      \"specInfo\": [\n" +
                "        {\n" +
                "          \"name\": \"颜色\",\n" +
                "          \"specId\": 57000,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4711838173,\n" +
                "              \"specValueName\": \"桃红\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4708573173,\n" +
                "              \"specValueName\": \"孔雀蓝\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"尺码\",\n" +
                "          \"specId\": 742769173,\n" +
                "          \"specValueList\": [\n" +
                "            {\n" +
                "              \"specValueId\": 4703013173,\n" +
                "              \"specValueName\": \"160\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4679015173,\n" +
                "              \"specValueName\": \"165\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672545173,\n" +
                "              \"specValueName\": \"170\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4672548173,\n" +
                "              \"specValueName\": \"175\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678816173,\n" +
                "              \"specValueName\": \"180\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4678342173,\n" +
                "              \"specValueName\": \"185\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4680004173,\n" +
                "              \"specValueName\": \"190\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702684173,\n" +
                "              \"specValueName\": \"195\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"specValueId\": 4702500173,\n" +
                "              \"specValueName\": \"200\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"subGoodsType\": 101,\n" +
                "      \"title\": \"柒牌/春夏/丝光棉短T恤/714T52110\",\n" +
                "      \"totalGoodsNum\": 0,\n" +
                "      \"vid\": 6001657119915\n" +
                "    },\n" +
                "    \"vid\": 6001657119915,\n" +
                "    \"vidInfo\": {\n" +
                "      \"bosId\": 4000557318915,\n" +
                "      \"vid\": 6001657119915,\n" +
                "      \"vidName\": \"广州小程序商城\"\n" +
                "    }\n" +
                "  }\n" +
                "]");

         return sb.toString();
    }
}
