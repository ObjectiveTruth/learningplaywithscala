package models

import sorm._
/**
 * Created by ObjectiveTruth on 2/16/2015.
 */

object DB extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")
