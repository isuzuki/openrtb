package io.github.isuzuki

package object openrtb2_5 {
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
    case object Annoying                        extends CreativeAttribute(10)
    case object Survey                          extends CreativeAttribute(11)
    case object TextOnly                        extends CreativeAttribute(12)
    // e.g., Embedded Games
    case object UserInteractive                 extends CreativeAttribute(13)
    case object WindowsDialogOrAlertStyle       extends CreativeAttribute(14)
    case object HasAudioOnOffButton             extends CreativeAttribute(15)
    // e.g., Skip Button on Pre-Roll Video
    case object AdProvidesSkipButton            extends CreativeAttribute(16)
    case object AdobeFlash                      extends CreativeAttribute(17)
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
    case object MRAID_3  extends APIFramework(6)
  }

  sealed abstract class VideoLinearity(val value: Int)
  object VideoLinearity {
    case object Linear    extends VideoLinearity(1) // Linear / In-Stream
    case object NonLinear extends VideoLinearity(2) // Non-Linear / Overlay
  }

  sealed abstract class Protocol(val value: Int)
  object Protocol {
    case object VAST1_0         extends Protocol(1)
    case object VAST2_0         extends Protocol(2)
    case object VAST3_0         extends Protocol(3)
    case object VAST1_0Wrapper  extends Protocol(4)
    case object VAST2_0Wrapper  extends Protocol(5)
    case object VAST3_0Wrapper  extends Protocol(6)
    case object VAST4_0         extends Protocol(7)
    case object VAST4_0Wrapper  extends Protocol(8)
    case object DAAST1_0        extends Protocol(9)
    case object DAAST1_0Wrapper extends Protocol(10)
  }

  sealed abstract class VideoPlacementType(val value: Int)
  object VideoPlacementType {
    case object InStream                     extends VideoPlacementType(1)
    case object InBanner                     extends VideoPlacementType(2)
    case object InArtice                     extends VideoPlacementType(3)
    case object InFeed                       extends VideoPlacementType(4)
    case object Interstitial_Slider_Floating extends VideoPlacementType(5)
  }

  sealed abstract class PlaybackMethod(val value: Int)
  object PlaybackMethod {
    case object AutpPlaySoundOn              extends PlaybackMethod(1)
    case object AutpPlaySoundOff             extends PlaybackMethod(2)
    case object ClickToPlay                  extends PlaybackMethod(3)
    case object MouseOver                    extends PlaybackMethod(4)
    case object EnteringViewportWithSoundOn  extends PlaybackMethod(5)
    case object EnteringViewportWithSoundOff extends PlaybackMethod(6)
  }

  sealed abstract class PlaybackCessationMode(val value: Int)
  object PlaybackCessationMode {
    case object OnVideoCompletionOrTerminated          extends PlaybackCessationMode(1)
    case object OnLeavingViewportOrTerminated          extends PlaybackCessationMode(2)
    case object OnLeavingViewportContinuesOrTerminated extends PlaybackCessationMode(3)
  }

  sealed abstract class StartDelay(val value: Int)
  object StartDelay {
    case object PreRoll         extends StartDelay(0)
    case object GenericMidRoll  extends StartDelay(-1)
    case object GenericPostRoll extends StartDelay(-2)
  }

  sealed abstract class ProductionQuality(val value: Int)
  object ProductionQuality {
    case object Unknown                extends ProductionQuality(0)
    case object ProfessionallyProduced extends ProductionQuality(1)
    case object Prosumer               extends ProductionQuality(2)
    case object UserGenerated          extends ProductionQuality(3) // User Generated(UGC)
  }

  sealed abstract class CompanionType(val value: Int)
  object CompanionType {
    case object StaticResource extends CompanionType(1)
    case object HTMLResource   extends CompanionType(2)
    case object IframeResource extends CompanionType(3)
  }

  sealed abstract class ContentDeliveryMethod(val value: Int)
  object ContentDeliveryMethod {
    case object Streaming   extends ContentDeliveryMethod(1)
    case object Progressive extends ContentDeliveryMethod(2)
    case object Download    extends ContentDeliveryMethod(3)
  }

  sealed abstract class FeedType(val value: Int)
  object FeedType {
    case object MusicService   extends FeedType(1)
    case object FM_AMBroadcast extends FeedType(2)
    case object Podcast        extends FeedType(3)
  }

  sealed abstract class VolumeNormalizationMode(val value: Int)
  object VolumeNormalizationMode {
    case object None                      extends VolumeNormalizationMode(0)
    case object AdVolumeAverageNormalized extends VolumeNormalizationMode(1)
    case object AdVolumePeakNormalized    extends VolumeNormalizationMode(2)
    case object AdLoudnessNormalized      extends VolumeNormalizationMode(3)
    case object CustomVolumeNormalization extends VolumeNormalizationMode(4)
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

  sealed abstract class IQGMediaRating(val value: Int)
  object IQGMediaRating {
    case object AllAudiences    extends IQGMediaRating(1)
    case object EveryoneOver12  extends IQGMediaRating(2)
    case object MatureAudiences extends IQGMediaRating(3)
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

  sealed abstract class IPLocationService(val value: Int)
  object IPLocationService {
    case object Ip2Location extends IPLocationService(1)
    case object Neustar     extends IPLocationService(2)
    case object MaxMind     extends IPLocationService(3)
    case object NetAquity   extends IPLocationService(4)
  }

  sealed abstract class NoBidReasonCode(val value: Int)
  object NoBidReasonCode {
    case object UnknownError             extends NoBidReasonCode(0)
    case object TechnicalError           extends NoBidReasonCode(1)
    case object InvalidRequest           extends NoBidReasonCode(2)
    case object KnownWebSpider           extends NoBidReasonCode(3)
    case object SuspectedNonHumanTraffic extends NoBidReasonCode(4)
    case object CloudDatacenterProxyIP   extends NoBidReasonCode(5)
    case object UnsupportedDevice        extends NoBidReasonCode(6)
    case object BlockedPublisherOrSite   extends NoBidReasonCode(7)
    case object UnmatchedUser            extends NoBidReasonCode(8)
    case object DailyReaderCapMet        extends NoBidReasonCode(9)
    case object DailyDomainCapMet        extends NoBidReasonCode(10)
  }

  sealed abstract class LossReasonCode(val value: Int)
  object LossReasonCode {
    case object BidWon                                      extends LossReasonCode(0)
    case object InternalError                               extends LossReasonCode(1)
    case object ImpressionOpportunityExpired                extends LossReasonCode(2)
    case object InvalidBidResponse                          extends LossReasonCode(3)
    case object InvalidDealID                               extends LossReasonCode(4)
    case object InvalidAuctionID                            extends LossReasonCode(5)
    case object InvalidAdvertiserDomain                     extends LossReasonCode(6)
    case object MissingMarkup                               extends LossReasonCode(7)
    case object MissingCreativeID                           extends LossReasonCode(8)
    case object MissingBidPrice                             extends LossReasonCode(9)
    case object MissingMinimumCreativeApprovalData          extends LossReasonCode(10)
    case object BidBelowAuctionFloor                        extends LossReasonCode(100)
    case object BidBelowDealFloor                           extends LossReasonCode(101)
    case object LostHigherBid                               extends LossReasonCode(102)
    case object LostBidPMPDeal                              extends LossReasonCode(103)
    case object BuyerSeatBlocked                            extends LossReasonCode(104)
    case object CreativeFilteredGeneral                     extends LossReasonCode(200)
    case object CreativeFilteredPending                     extends LossReasonCode(201)
    case object CreativeFilteredDisapproved                 extends LossReasonCode(202)
    case object CreativeFilteredSizeNotAllowed              extends LossReasonCode(203)
    case object CreativeFilteredIncorrectCreativeFormat     extends LossReasonCode(204)
    case object CreativeFilteredAdvertiserExclusions        extends LossReasonCode(205)
    case object CreativeFilteredAppBundleExclusions         extends LossReasonCode(206)
    case object CreativeFilteredNotSecure                   extends LossReasonCode(207)
    case object CreativeFilteredLanguageExclusions          extends LossReasonCode(208)
    case object CreativeFilteredCategoryExclusions          extends LossReasonCode(209)
    case object CreativeFilteredCreativeAttributeExclusions extends LossReasonCode(210)
    case object CreativeFilteredAdTypeExclusions            extends LossReasonCode(211)
    case object CreativeFilteredAnimationTooLong            extends LossReasonCode(212)
    case object CreativeFilteredNotAllowedPMPDeal           extends LossReasonCode(213)
  }
}
