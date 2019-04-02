package com.wyj.leecode.test;

import lombok.Data;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.util.StopWatch;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyujue
 */
public class TestArray {

    public static int num = 10;

    public static void main(String[] args) {
        Object obj = new Object();

        Integer type = obj == null ? 0 : null;
        System.out.println("---111111--");


        Integer my =null;
        Integer type002 = obj == null ? 0 : my;
        System.out.println("--22222---");
    }

//    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        StopWatch sw = new StopWatch();
//        sw.start("测试手动jackson性能");
//        Model model = new Model();
//        model.setId(1);
//        model.setName("王玉珏");
//        model.setAddress("徐汇区钦州北路1188号科汇大厦10F");
//        model.setCompany("上海卓越睿新数码科技有限公司");
//        List<Dto> list = new ArrayList<>();
////        for (int i = 0; i < num; i++) {
////            Dto dto = transTo(model, Dto.class);
////        }
//        for (int i = 0; i < num; i++) {
//            Dto dto = new Dto();
//            PropertyUtils.copyProperties(dto, model);
//            System.out.println(dto);
//        }
////        for (int i = 0; i < num; i++) {
////            Dto dto = new Dto();
////            dto.setId(model.getId());
////            dto.setAddress(model.getAddress());
////            dto.setCompany(model.getCompany());
////            dto.setName(model.getName());
////        }
//        sw.stop();
//        System.out.println(sw.prettyPrint());
//    }

    public static void caculate(Integer num, Integer randomNum, Integer total) {
        Integer s = new BigDecimal(num).
                divide(new BigDecimal(randomNum), 4, 4).
                multiply(new BigDecimal(total)).
                intValue();
        String divide = new BigDecimal(s).divide(new BigDecimal(total), 4, 4).multiply(new BigDecimal(100)).toString();
        System.out.println(s);
        System.out.println(divide.toString() + "%");
    }

    @Data
    public static class Model {
        Integer id;
        String name;
        String address;
        String company;
    }

    @Data
    public static class Dto {
        Integer id;
        String name;
        String address;
        String company;
    }

    /**
     * 对象类型转换(字段类型、名称应相同，字段数可以不等)
     *
     * @param origin     原对象
     * @param targetType 目标类型
     * @return
     */
    public static final <T> T transTo(Object origin, Class<T> targetType) {
        StopWatch sw = new StopWatch();
        if (origin == null) return null;
        Assert.notNull(targetType);
        sw.start("beanUtils.instantiate");
        T target = BeanUtils.instantiate(targetType);
        sw.stop();
        sw.start("copyProperties");
        copyProperties(origin, target);
        sw.stop();
        System.out.println(sw.prettyPrint());
        return target;
    }

    /**
     * 对象间属性拷贝
     *
     * @param origin 原对象
     * @param target 目标对象
     */
    public static final void copyProperties(Object origin, Object target) {
        if (origin == null) return;
        Assert.notNull(target);
        BeanUtils.copyProperties(origin, target);
    }


}
