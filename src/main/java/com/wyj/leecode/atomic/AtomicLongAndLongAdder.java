package com.wyj.leecode.atomic;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author wangyujue
 */
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@BenchmarkMode(Mode.Throughput)
public class AtomicLongAndLongAdder {

    private static AtomicLong atomicLong = new AtomicLong();
    private static LongAdder longAdder = new LongAdder();

    public static void main(String[] args) throws Exception {
        Options options = new OptionsBuilder().
                include(AtomicLongAndLongAdder.class.getName()).
                output("C:/file/demo.log").
                forks(1).
                build();
        new Runner(options).run();
    }

    @Benchmark
    @Threads(1)
    public void run0() {
        atomicLong.getAndIncrement();
    }

    @Benchmark
    @Threads(1)
    public void run1() {
        longAdder.increment();
    }
}
