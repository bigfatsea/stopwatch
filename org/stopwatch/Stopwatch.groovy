package org.stopwatch

/**
 * Created by Stanford on 12/2/16.
 */
class Stopwatch {
    private List<Pair<String, Long>> marks = new ArrayList()
    private long start = System.currentTimeMillis()

    /**
     * set a mark
     */
    Stopwatch pause(String mark) {
        marks.add(new Pair(mark, System.currentTimeMillis() - start))
        return this
    }

    /**
     * set a mark, and reset time
     */
    Stopwatch stop(String mark) {
        marks.add(new Pair(mark, System.currentTimeMillis() - start))
        start = System.currentTimeMillis()
        return this
    }

    /**
     * clear all marks
     */
    Stopwatch clear() {
        marks.clear()
        start = System.currentTimeMillis()
        return this
    }


    @Override
    public String toString() {
        int markMax = marks.max { it.mark.length() }?.mark?.length() ?: 1
        int timeMax = marks.max { it.time }?.time?.toString()?.length() ?: 1
        String format = "%-${markMax}s  %,${timeMax + 3}.3f s"
        return marks.collect {
            String.format(format, it.mark, it.time / 1000.0)
        }.join('\n')
    }

    private static class Pair<String, Long> {
        String mark
        Long time

        Pair(String mark, Long time) {
            this.mark = mark ?: '<empty>'
            this.time = time
        }
    }
}
