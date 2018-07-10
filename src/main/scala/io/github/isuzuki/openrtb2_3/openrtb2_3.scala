package io.github.isuzuki

package object openrtb2_3 {
  sealed abstract class BannerAdType(val value: Int)
  object BannerAdType {
    case object XHTMLTextAd   extends BannerAdType(1)
    case object XHTMLBannerAd extends BannerAdType(2)
    case object JavaScriptAd  extends BannerAdType(3)
    case object Iframe        extends BannerAdType(4)
  }

  sealed abstract class CreativeAttribute(val value: Int)
  object CreativeAttribute {
    case object AudioAdAutoPlay                 extends CreativeAttribute(1)
    case object AudioAdUserInitiated            extends CreativeAttribute(2)
    case object ExpandableAutomatic             extends CreativeAttribute(3)
    case object ExpandableUserInitiatedClick    extends CreativeAttribute(4)
    case object ExpandableUserInitiatedRollover extends CreativeAttribute(5)
    case object InBannerVideoAdAutoPlay         extends CreativeAttribute(6)
    case object InBannerVideoAdUserInitiated    extends CreativeAttribute(7)
    // e.g., Over, Under, or Upon Exit
    case object Pop                             extends CreativeAttribute(8)
    case object ProvocativeOrSuggestiveImagery  extends CreativeAttribute(9)
    // e.g., Shaky, Flashing, Flickering, Extreme Animation, Smileys
    // refer to: https://github.com/google/openrtb/blob/master/openrtb-core/src/main/protobuf/openrtb.proto#L2334
    case object ANNOYING                        extends CreativeAttribute(10)
    case object Survey                          extends CreativeAttribute(11)
    case object TextOnly                        extends CreativeAttribute(12)
    // e.g., Embedded Games
    case object UserInteractive                 extends CreativeAttribute(13)
    case object WindowsDialogOrAlertStyle       extends CreativeAttribute(14)
    case object HasAudioOnOffButton             extends CreativeAttribute(15)
    // e.g., Skip Button on Pre-Roll Video
    case object AdCanBeSkipped                  extends CreativeAttribute(16)
  }

  sealed abstract class AdPosition(val value: Int)
  object AdPosition {
    case object Unknown            extends AdPosition(0)
    case object AboveTheFold       extends AdPosition(1)
    // May or may not be initially visible depending on screen size/resolution.
    // refer to: https://github.com/google/openrtb/blob/master/openrtb-core/src/main/protobuf/openrtb.proto#L2382
    @deprecated("Deprecated.", "OpenRTB ver2.3")
    case object LikelyBelowTheFold extends AdPosition(2)
    case object BelowTheFold       extends AdPosition(3)
    case object Header             extends AdPosition(4)
    case object Footer             extends AdPosition(5)
    case object Sidebar            extends AdPosition(6)
    case object FullScreen         extends AdPosition(7)
  }

  sealed abstract class ExpandableDirection(val value: Int)
  object ExpandableDirection {
    case object Left       extends ExpandableDirection(1)
    case object Right      extends ExpandableDirection(2)
    case object Up         extends ExpandableDirection(3)
    case object Down       extends ExpandableDirection(4)
    case object FullScreen extends ExpandableDirection(5)
  }

  sealed abstract class APIFramework(val value: Int)
  object APIFramework {
    case object VPAID1_0 extends APIFramework(1)
    case object VPAID2_0 extends APIFramework(2)
    case object MRAID_1  extends APIFramework(3)
    case object ORMMA    extends APIFramework(4)
    case object MRAID_2  extends APIFramework(5)
  }

  sealed abstract class VideoLinearity(val value: Int)
  object VideoLinearity {
    case object Linear    extends VideoLinearity(1) // Linear / In-Stream
    case object NonLinear extends VideoLinearity(2) // Non-Linear / Overlay
  }

  sealed abstract class VideoProtocol(val value: Int)
  object VideoProtocol {
    case object VAST1_0        extends VideoProtocol(1)
    case object VAST2_0        extends VideoProtocol(2)
    case object VAST3_0        extends VideoProtocol(3)
    case object VAST1_0Wrapper extends VideoProtocol(4)
    case object VAST2_0Wrapper extends VideoProtocol(5)
    case object VAST3_0Wrapper extends VideoProtocol(6)
  }

  sealed abstract class VideoPlaybackMethod(val value: Int)
  object VideoPlaybackMethod {
    case object AutpPlaySoundOn  extends VideoPlaybackMethod(1)
    case object AutpPlaySoundOff extends VideoPlaybackMethod(2)
    case object ClickToPlay      extends VideoPlaybackMethod(3)
    case object MouseOver        extends VideoPlaybackMethod(4)
  }

  sealed abstract class VideoStartDelay(val value: Int)
  object VideoStartDelay {
    case object PreRoll         extends VideoStartDelay(0)
    case object GenericMidRoll  extends VideoStartDelay(-1)
    case object GenericPostRoll extends VideoStartDelay(-2)
  }

  sealed abstract class VideoQuality(val value: Int)
  object VideoQuality {
    case object Unknown                extends VideoQuality(0)
    case object ProfessionallyProduced extends VideoQuality(1)
    case object Prosumer               extends VideoQuality(2)
    case object UserGenerated          extends VideoQuality(3) // User Generated(UGC)
  }

  sealed abstract class VASTCompanionType(val value: Int)
  object VASTCompanionType {
    case object StaticResource extends VASTCompanionType(1)
    case object HTMLResource   extends VASTCompanionType(2)
    case object IframeResource extends VASTCompanionType(3)
  }

  sealed abstract class ContentDeliveryMethod(val value: Int)
  object ContentDeliveryMethod {
    case object Streaming   extends ContentDeliveryMethod(1)
    case object Progressive extends ContentDeliveryMethod(2)
  }

  sealed abstract class ContentContext(val value: Int)
  object ContentContext {
    case object Video       extends ContentContext(1)
    case object Game        extends ContentContext(2)
    case object Music       extends ContentContext(3)
    case object Application extends ContentContext(4)
    case object Text        extends ContentContext(5)
    case object Other       extends ContentContext(6)
    case object Unknown     extends ContentContext(7)
  }

  sealed abstract class QAGMediaRating(val value: Int)
  object QAGMediaRating {
    case object AllAudiences    extends QAGMediaRating(1)
    case object EveryoneOver12  extends QAGMediaRating(2)
    case object MatureAudiences extends QAGMediaRating(3)
  }

  sealed abstract class LocationType(val value: Int)
  object LocationType {
    case object GPS_LocationServices extends LocationType(1)
    case object IPAddress            extends LocationType(2)
    case object UserProvided         extends LocationType(3)
  }

  sealed abstract class DeviceType(val value: Int)
  object DeviceType {
    case object MobileTablet     extends DeviceType(1) // Version 2.0
    case object PersonalComputer extends DeviceType(2) // Version 2.0
    case object ConnectedTV      extends DeviceType(3) // Version 2.0
    case object Phone            extends DeviceType(4) // Version 2.2
    case object Tablet           extends DeviceType(5) // Version 2.2
    case object ConnectedDevice  extends DeviceType(6) // Version 2.2
    case object SetTopBox        extends DeviceType(7) // Version 2.2
  }

  sealed abstract class ConnectionType(val value: Int)
  object ConnectionType {
    case object Unknown                           extends ConnectionType(0)
    case object Ethernet                          extends ConnectionType(1)
    case object WIFI                              extends ConnectionType(2)
    case object CellularNetwork_UnknownGeneration extends ConnectionType(3)
    case object CellularNetwork_2G                extends ConnectionType(4)
    case object CellularNetwork_3G                extends ConnectionType(5)
    case object CellularNetwork_4G                extends ConnectionType(6)
  }

  sealed abstract class NoBidReasonCode(val value: Int)
  object NoBidReasonCode {
    case object UnknownError extends NoBidReasonCode(0)
    case object TechnicalError extends NoBidReasonCode(1)
    case object InvalidRequest extends NoBidReasonCode(2)
    case object KnownWebSpider extends NoBidReasonCode(3)
    case object SuspectedNonHumanTraffic extends NoBidReasonCode(4)
    case object CloudDatacenterProxyIP extends NoBidReasonCode(5)
    case object UnsupportedDevice extends NoBidReasonCode(6)
    case object BlockedPublisherOrSite extends NoBidReasonCode(7)
    case object UnmatchedUser extends NoBidReasonCode(8)
  }
}
