package playground

import com.typesafe.scalalogging.LazyLogging

object Playground extends App with LazyLogging {
  logger.error("This is an ERROR message")
  logger.info("This is a INFO message")
  logger.warn("This is a WARN message")
  logger.debug("This is a DEBUG message")
  logger.trace("This is a TRACE message")
}
