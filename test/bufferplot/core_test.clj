(ns bufferplot.core-test
  (:require [clojure.test :refer :all]
            [bufferplot.core :refer :all]))


(comment

  (plot-buffer "/mnt/sdcard/tmp/marco-buffer.log")

  (plot-buffer "/mnt/sdcard/tmp/parade.log")

  (plot-buffer "/mnt/sdcard/tmp/randomshow-buf.log")


  (plot-buffer "/mnt/sdcard/tmp/blog2")

  (plot-buffer "/mnt/sdcard/tmp/ices2-test.log")

  (plot-buffer "/mnt/sdcard/tmp/ices-bamfic.log")


  (plot-buffer "/mnt/sdcard/tmp/with-441.log")

  (plot-buffer "/mnt/sdcard/tmp/denny.log")
  (save @plot "/home/cust/knyo/logs/denny.png" :width 1280 :height 768)
  (save-pdf @plot "/home/cust/knyo/logs/denny.pdf" :width 1280 :height 768)


  (plot-buffer "/mnt/sdcard/tmp/reggae.log")
  (save @plot "/home/cust/knyo/logs/reggae.png" :width 1280 :height 768)
  (save-pdf @plot "/mnt/sdcard/tmp/reggae.pdf" :width 1280 :height 768)
  
  )