package com.imooc.order.utils;


import com.imooc.order.vo.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * @Author wushaopei
 * @Date 2019/11/15 10:35
 * @Version 1.0
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
