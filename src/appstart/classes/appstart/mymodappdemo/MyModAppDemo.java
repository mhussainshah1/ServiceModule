package appstart.mymodappdemo;

import static appfuncs.simplefuncs.SimpleMathFuncs.*;
import java.util.ServiceLoader;
import userfuncs.binaryfuncs.BinaryFunc;
import userfuncs.binaryfuncs.BinaryFuncProvider;

public class MyModAppDemo {

    public static void main(String[] args) {
        if (isFactor(2, 10)) {
            System.out.println("2 is a factor of 10");
        }
        System.out.println("Smallest factor common to both 35 and 105 is "
                + lcf(35, 105));
        System.out.println("Largest factor common to both 35 and 105 is "
                + gcf(35, 105));

        var listServiceLoader = ServiceLoader.load(BinaryFuncProvider.class);
        BinaryFunc binaryFunc = null;

        for (var binaryFuncProvider : listServiceLoader) {
            if (binaryFuncProvider.get().getName().equals("absPlus")) {
                binaryFunc = binaryFuncProvider.get();
                break;
            }
        }
        if (binaryFunc != null) {
            System.out.println("Result of absPlus function: " + binaryFunc.func(12, -4));
        } else {
            System.out.println("absPlus function not found");
        }
        
        binaryFunc = null;

        for (var binaryFuncProvider : listServiceLoader) {
            if (binaryFuncProvider.get().getName().equals("absMinus")) {
                binaryFunc = binaryFuncProvider.get();
                break;
            }
        }
        if (binaryFunc != null) {
            System.out.println("Result of absMinus function: " + binaryFunc.func(12, -4));
        } else {
            System.out.println("absMinus function not found");
        }
    }
}
