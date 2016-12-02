# Stopwatch
A super simple stopwatch

### Exmaple:

```
        def sw = new Stopwatch()

        sw.pause('pause 1')
        Thread.sleep(500)
        sw.pause('pause 2')
        Thread.sleep(500)
        sw.stop('stop')
        Thread.sleep(500)
        sw.stop('stop')

        println sw.toString()
```