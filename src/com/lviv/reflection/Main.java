package com.lviv.reflection;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {37, 37, 35, 37, 37, 37, 38};
        VitaliiJavaTask vitaliiJavaTask = new VitaliiJavaTask();
        int target = 0;
        try {
            Class[] argTypes = new Class[]{int[].class};
            Method method = VitaliiJavaTask.class.getDeclaredMethod(
                    "secondLargest", argTypes);
            method.setAccessible(true);
            Integer result = (Integer) method.invoke(vitaliiJavaTask, array);
            System.out.println(result);
            System.out.println("----------------------------------------------------------------");
            Class[] argTypes2 = new Class[]{int[].class, int.class};
            Method method2 = VitaliiJavaTask.class.getDeclaredMethod(
                    "findPairs", argTypes2);
            method2.setAccessible(true);
            Integer result2 = (Integer) method2.invoke(vitaliiJavaTask, array, target);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }

    }

}
