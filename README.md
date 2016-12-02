# stopwatch
A super simple stop watch

### Exmaple:

```
        def sw = new Stopwatch()
        println sw.toString()
        sw.pause('pause 1')
        Thread.sleep(500)
        sw.pause('pause 2')
        Thread.sleep(500)
        sw.stop('stop')
        Thread.sleep(500)
        sw.stop('stop')

        println sw.toString()
```