package com.github.zhuaidadaya.rikaishinikui.handler.universal.times;

import com.github.zhuaidadaya.rikaishinikui.handler.universal.entrust.*;

public class TimeUtil {
    public static long millions() {
        return System.currentTimeMillis();
    }

    public static long nano() {
        return System.nanoTime();
    }

    public static long processMillion(long million) {
        return millions() - million;
    }

    public static long processNano(long nano) {
        return nano() - nano;
    }

    public static void sleep(long millions) throws InterruptedException {
        if (millions < 0)
            return;
        Thread.sleep(millions);
    }

    public static void coma(long millions) {
        EntrustExecution.tryTemporary(() -> {
            Thread.sleep(millions);
        });
    }
}
