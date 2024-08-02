package simplesttalks.core

import io.circe._, io.circe.generic.semiauto._, io.circe.syntax._

case class TalkList(
    series: String,
    short: String,
    files: Seq[String],
    archived: Seq[String],
    timezone: String
) 

given Encoder[TalkList] = deriveEncoder[TalkList]
given Decoder[TalkList] = deriveDecoder[TalkList]

case class Talk(
    title:String,
    speaker:String,
    speakerUrl:String,
    date:String,
    start:String,
    duration:String,
    `abstract`:String,
    where:Seq[String]
)

given Encoder[Talk] = deriveEncoder[Talk]
given Decoder[Talk] = deriveDecoder[Talk]