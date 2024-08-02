package simplesttalks

import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

case class TalkList(
    series: String,
    short: String,
    files: Seq[String],
    archived: Seq[String],
    timezone: String
) derives Reader, Writer