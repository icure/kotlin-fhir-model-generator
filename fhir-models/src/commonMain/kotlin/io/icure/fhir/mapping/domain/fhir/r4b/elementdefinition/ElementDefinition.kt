//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.elementdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.address.Address
import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4b.contributor.Contributor
import io.icure.fhir.mapping.domain.fhir.r4b.count.Count
import io.icure.fhir.mapping.domain.fhir.r4b.datarequirement.DataRequirement
import io.icure.fhir.mapping.domain.fhir.r4b.distance.Distance
import io.icure.fhir.mapping.domain.fhir.r4b.dosage.Dosage
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.humanname.HumanName
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.money.Money
import io.icure.fhir.mapping.domain.fhir.r4b.parameterdefinition.ParameterDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r4b.ratiorange.RatioRange
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4b.sampleddata.SampledData
import io.icure.fhir.mapping.domain.fhir.r4b.signature.Signature
import io.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import io.icure.fhir.mapping.domain.fhir.r4b.triggerdefinition.TriggerDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of an element in a resource or extension
 *
 * Captures constraints on each element within the resource, profile, or extension.
 *
 * @param id Unique id for inter-element referencing
 * @param path Path of the element in the hierarchy of elements
 * @param sliceName Name for this particular element (in a set of slices)
 * @param sliceIsConstraining If this slice definition constrains an inherited slice definition (or
 * not)
 * @param label Name for element to display with or prompt for element
 * @param slicing This element is sliced - slices follow
 * @param short Concise definition for space-constrained presentation
 * @param definition Full formal definition as narrative text
 * @param comment Comments about the use of this element
 * @param requirements Why this resource has been created
 * @param min Minimum Cardinality
 * @param max Maximum Cardinality (a number or *)
 * @param base Base definition information for tools
 * @param contentReference Reference to definition of content for the element
 * @param defaultValueBase64Binary Specified value if missing from instance
 * @param defaultValueBoolean Specified value if missing from instance
 * @param defaultValueCanonical Specified value if missing from instance
 * @param defaultValueCode Specified value if missing from instance
 * @param defaultValueDate Specified value if missing from instance
 * @param defaultValueDateTime Specified value if missing from instance
 * @param defaultValueDecimal Specified value if missing from instance
 * @param defaultValueId Specified value if missing from instance
 * @param defaultValueInstant Specified value if missing from instance
 * @param defaultValueInteger Specified value if missing from instance
 * @param defaultValueMarkdown Specified value if missing from instance
 * @param defaultValueOid Specified value if missing from instance
 * @param defaultValuePositiveInt Specified value if missing from instance
 * @param defaultValueString Specified value if missing from instance
 * @param defaultValueTime Specified value if missing from instance
 * @param defaultValueUnsignedInt Specified value if missing from instance
 * @param defaultValueUri Specified value if missing from instance
 * @param defaultValueUrl Specified value if missing from instance
 * @param defaultValueUuid Specified value if missing from instance
 * @param defaultValueAddress Specified value if missing from instance
 * @param defaultValueAge Specified value if missing from instance
 * @param defaultValueAnnotation Specified value if missing from instance
 * @param defaultValueAttachment Specified value if missing from instance
 * @param defaultValueCodeableConcept Specified value if missing from instance
 * @param defaultValueCodeableReference Specified value if missing from instance
 * @param defaultValueCoding Specified value if missing from instance
 * @param defaultValueContactPoint Specified value if missing from instance
 * @param defaultValueCount Specified value if missing from instance
 * @param defaultValueDistance Specified value if missing from instance
 * @param defaultValueDuration Specified value if missing from instance
 * @param defaultValueHumanName Specified value if missing from instance
 * @param defaultValueIdentifier Specified value if missing from instance
 * @param defaultValueMoney Specified value if missing from instance
 * @param defaultValuePeriod Specified value if missing from instance
 * @param defaultValueQuantity Specified value if missing from instance
 * @param defaultValueRange Specified value if missing from instance
 * @param defaultValueRatio Specified value if missing from instance
 * @param defaultValueRatioRange Specified value if missing from instance
 * @param defaultValueReference Specified value if missing from instance
 * @param defaultValueSampledData Specified value if missing from instance
 * @param defaultValueSignature Specified value if missing from instance
 * @param defaultValueTiming Specified value if missing from instance
 * @param defaultValueContactDetail Specified value if missing from instance
 * @param defaultValueContributor Specified value if missing from instance
 * @param defaultValueDataRequirement Specified value if missing from instance
 * @param defaultValueExpression Specified value if missing from instance
 * @param defaultValueParameterDefinition Specified value if missing from instance
 * @param defaultValueRelatedArtifact Specified value if missing from instance
 * @param defaultValueTriggerDefinition Specified value if missing from instance
 * @param defaultValueUsageContext Specified value if missing from instance
 * @param defaultValueDosage Specified value if missing from instance
 * @param meaningWhenMissing Implicit meaning when this element is missing
 * @param orderMeaning What the order of the elements means
 * @param fixedBase64Binary Value must be exactly this
 * @param fixedBoolean Value must be exactly this
 * @param fixedCanonical Value must be exactly this
 * @param fixedCode Value must be exactly this
 * @param fixedDate Value must be exactly this
 * @param fixedDateTime Value must be exactly this
 * @param fixedDecimal Value must be exactly this
 * @param fixedId Value must be exactly this
 * @param fixedInstant Value must be exactly this
 * @param fixedInteger Value must be exactly this
 * @param fixedMarkdown Value must be exactly this
 * @param fixedOid Value must be exactly this
 * @param fixedPositiveInt Value must be exactly this
 * @param fixedString Value must be exactly this
 * @param fixedTime Value must be exactly this
 * @param fixedUnsignedInt Value must be exactly this
 * @param fixedUri Value must be exactly this
 * @param fixedUrl Value must be exactly this
 * @param fixedUuid Value must be exactly this
 * @param fixedAddress Value must be exactly this
 * @param fixedAge Value must be exactly this
 * @param fixedAnnotation Value must be exactly this
 * @param fixedAttachment Value must be exactly this
 * @param fixedCodeableConcept Value must be exactly this
 * @param fixedCodeableReference Value must be exactly this
 * @param fixedCoding Value must be exactly this
 * @param fixedContactPoint Value must be exactly this
 * @param fixedCount Value must be exactly this
 * @param fixedDistance Value must be exactly this
 * @param fixedDuration Value must be exactly this
 * @param fixedHumanName Value must be exactly this
 * @param fixedIdentifier Value must be exactly this
 * @param fixedMoney Value must be exactly this
 * @param fixedPeriod Value must be exactly this
 * @param fixedQuantity Value must be exactly this
 * @param fixedRange Value must be exactly this
 * @param fixedRatio Value must be exactly this
 * @param fixedRatioRange Value must be exactly this
 * @param fixedReference Value must be exactly this
 * @param fixedSampledData Value must be exactly this
 * @param fixedSignature Value must be exactly this
 * @param fixedTiming Value must be exactly this
 * @param fixedContactDetail Value must be exactly this
 * @param fixedContributor Value must be exactly this
 * @param fixedDataRequirement Value must be exactly this
 * @param fixedExpression Value must be exactly this
 * @param fixedParameterDefinition Value must be exactly this
 * @param fixedRelatedArtifact Value must be exactly this
 * @param fixedTriggerDefinition Value must be exactly this
 * @param fixedUsageContext Value must be exactly this
 * @param fixedDosage Value must be exactly this
 * @param patternBase64Binary Value must have at least these property values
 * @param patternBoolean Value must have at least these property values
 * @param patternCanonical Value must have at least these property values
 * @param patternCode Value must have at least these property values
 * @param patternDate Value must have at least these property values
 * @param patternDateTime Value must have at least these property values
 * @param patternDecimal Value must have at least these property values
 * @param patternId Value must have at least these property values
 * @param patternInstant Value must have at least these property values
 * @param patternInteger Value must have at least these property values
 * @param patternMarkdown Value must have at least these property values
 * @param patternOid Value must have at least these property values
 * @param patternPositiveInt Value must have at least these property values
 * @param patternString Value must have at least these property values
 * @param patternTime Value must have at least these property values
 * @param patternUnsignedInt Value must have at least these property values
 * @param patternUri Value must have at least these property values
 * @param patternUrl Value must have at least these property values
 * @param patternUuid Value must have at least these property values
 * @param patternAddress Value must have at least these property values
 * @param patternAge Value must have at least these property values
 * @param patternAnnotation Value must have at least these property values
 * @param patternAttachment Value must have at least these property values
 * @param patternCodeableConcept Value must have at least these property values
 * @param patternCodeableReference Value must have at least these property values
 * @param patternCoding Value must have at least these property values
 * @param patternContactPoint Value must have at least these property values
 * @param patternCount Value must have at least these property values
 * @param patternDistance Value must have at least these property values
 * @param patternDuration Value must have at least these property values
 * @param patternHumanName Value must have at least these property values
 * @param patternIdentifier Value must have at least these property values
 * @param patternMoney Value must have at least these property values
 * @param patternPeriod Value must have at least these property values
 * @param patternQuantity Value must have at least these property values
 * @param patternRange Value must have at least these property values
 * @param patternRatio Value must have at least these property values
 * @param patternRatioRange Value must have at least these property values
 * @param patternReference Value must have at least these property values
 * @param patternSampledData Value must have at least these property values
 * @param patternSignature Value must have at least these property values
 * @param patternTiming Value must have at least these property values
 * @param patternContactDetail Value must have at least these property values
 * @param patternContributor Value must have at least these property values
 * @param patternDataRequirement Value must have at least these property values
 * @param patternExpression Value must have at least these property values
 * @param patternParameterDefinition Value must have at least these property values
 * @param patternRelatedArtifact Value must have at least these property values
 * @param patternTriggerDefinition Value must have at least these property values
 * @param patternUsageContext Value must have at least these property values
 * @param patternDosage Value must have at least these property values
 * @param minValueDate Minimum Allowed Value (for some types)
 * @param minValueDateTime Minimum Allowed Value (for some types)
 * @param minValueInstant Minimum Allowed Value (for some types)
 * @param minValueTime Minimum Allowed Value (for some types)
 * @param minValueDecimal Minimum Allowed Value (for some types)
 * @param minValueInteger Minimum Allowed Value (for some types)
 * @param minValuePositiveInt Minimum Allowed Value (for some types)
 * @param minValueUnsignedInt Minimum Allowed Value (for some types)
 * @param minValueQuantity Minimum Allowed Value (for some types)
 * @param maxValueDate Maximum Allowed Value (for some types)
 * @param maxValueDateTime Maximum Allowed Value (for some types)
 * @param maxValueInstant Maximum Allowed Value (for some types)
 * @param maxValueTime Maximum Allowed Value (for some types)
 * @param maxValueDecimal Maximum Allowed Value (for some types)
 * @param maxValueInteger Maximum Allowed Value (for some types)
 * @param maxValuePositiveInt Maximum Allowed Value (for some types)
 * @param maxValueUnsignedInt Maximum Allowed Value (for some types)
 * @param maxValueQuantity Maximum Allowed Value (for some types)
 * @param maxLength Max length for strings
 * @param mustSupport If the element must be supported
 * @param isModifier If this modifies the meaning of other elements
 * @param isModifierReason Reason that this element is marked as a modifier
 * @param isSummary Include when _summary = true?
 * @param binding ValueSet details if this is coded
 */
@SerialName("ElementDefinition")
@Serializable
public data class ElementDefinition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Path of the element in the hierarchy of elements
   */
  public val path: String? = null,
  public val representation: List<String> = emptyList(),
  /**
   * Name for this particular element (in a set of slices)
   */
  public val sliceName: String? = null,
  /**
   * If this slice definition constrains an inherited slice definition (or not)
   */
  public val sliceIsConstraining: Boolean? = null,
  /**
   * Name for element to display with or prompt for element
   */
  public val label: String? = null,
  public val code: List<Coding> = emptyList(),
  /**
   * This element is sliced - slices follow
   */
  public val slicing: ElementDefinitionSlicing? = null,
  /**
   * Concise definition for space-constrained presentation
   */
  public val short: String? = null,
  /**
   * Full formal definition as narrative text
   */
  public val definition: String? = null,
  /**
   * Comments about the use of this element
   */
  public val comment: String? = null,
  /**
   * Why this resource has been created
   */
  public val requirements: String? = null,
  public val alias: List<String> = emptyList(),
  /**
   * Minimum Cardinality
   */
  public val min: Int? = null,
  /**
   * Maximum Cardinality (a number or *)
   */
  public val max: String? = null,
  /**
   * Base definition information for tools
   */
  public val base: ElementDefinitionBase? = null,
  /**
   * Reference to definition of content for the element
   */
  public val contentReference: String? = null,
  public val type: List<ElementDefinitionType> = emptyList(),
  /**
   * Specified value if missing from instance
   */
  public val defaultValueBase64Binary: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueBoolean: Boolean? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueCanonical: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueCode: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDate: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDateTime: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDecimal: Float? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueId: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueInstant: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueInteger: Int? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueMarkdown: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueOid: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValuePositiveInt: Int? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueString: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueTime: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueUnsignedInt: Int? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueUri: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueUrl: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueUuid: String? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueAddress: Address? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueAge: Age? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueAnnotation: Annotation? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueAttachment: Attachment? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueCodeableConcept: CodeableConcept? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueCodeableReference: CodeableReference? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueCoding: Coding? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueContactPoint: ContactPoint? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueCount: Count? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDistance: Distance? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDuration: Duration? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueHumanName: HumanName? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueIdentifier: Identifier? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueMoney: Money? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValuePeriod: Period? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueQuantity: Quantity? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueRange: Range? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueRatio: Ratio? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueRatioRange: RatioRange? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueReference: Reference? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueSampledData: SampledData? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueSignature: Signature? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueTiming: Timing? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueContactDetail: ContactDetail? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueContributor: Contributor? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDataRequirement: DataRequirement? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueExpression: Expression? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueParameterDefinition: ParameterDefinition? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueUsageContext: UsageContext? = null,
  /**
   * Specified value if missing from instance
   */
  public val defaultValueDosage: Dosage? = null,
  /**
   * Implicit meaning when this element is missing
   */
  public val meaningWhenMissing: String? = null,
  /**
   * What the order of the elements means
   */
  public val orderMeaning: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedBase64Binary: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedBoolean: Boolean? = null,
  /**
   * Value must be exactly this
   */
  public val fixedCanonical: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedCode: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDate: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDateTime: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDecimal: Float? = null,
  /**
   * Value must be exactly this
   */
  public val fixedId: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedInstant: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedInteger: Int? = null,
  /**
   * Value must be exactly this
   */
  public val fixedMarkdown: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedOid: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedPositiveInt: Int? = null,
  /**
   * Value must be exactly this
   */
  public val fixedString: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedTime: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedUnsignedInt: Int? = null,
  /**
   * Value must be exactly this
   */
  public val fixedUri: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedUrl: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedUuid: String? = null,
  /**
   * Value must be exactly this
   */
  public val fixedAddress: Address? = null,
  /**
   * Value must be exactly this
   */
  public val fixedAge: Age? = null,
  /**
   * Value must be exactly this
   */
  public val fixedAnnotation: Annotation? = null,
  /**
   * Value must be exactly this
   */
  public val fixedAttachment: Attachment? = null,
  /**
   * Value must be exactly this
   */
  public val fixedCodeableConcept: CodeableConcept? = null,
  /**
   * Value must be exactly this
   */
  public val fixedCodeableReference: CodeableReference? = null,
  /**
   * Value must be exactly this
   */
  public val fixedCoding: Coding? = null,
  /**
   * Value must be exactly this
   */
  public val fixedContactPoint: ContactPoint? = null,
  /**
   * Value must be exactly this
   */
  public val fixedCount: Count? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDistance: Distance? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDuration: Duration? = null,
  /**
   * Value must be exactly this
   */
  public val fixedHumanName: HumanName? = null,
  /**
   * Value must be exactly this
   */
  public val fixedIdentifier: Identifier? = null,
  /**
   * Value must be exactly this
   */
  public val fixedMoney: Money? = null,
  /**
   * Value must be exactly this
   */
  public val fixedPeriod: Period? = null,
  /**
   * Value must be exactly this
   */
  public val fixedQuantity: Quantity? = null,
  /**
   * Value must be exactly this
   */
  public val fixedRange: Range? = null,
  /**
   * Value must be exactly this
   */
  public val fixedRatio: Ratio? = null,
  /**
   * Value must be exactly this
   */
  public val fixedRatioRange: RatioRange? = null,
  /**
   * Value must be exactly this
   */
  public val fixedReference: Reference? = null,
  /**
   * Value must be exactly this
   */
  public val fixedSampledData: SampledData? = null,
  /**
   * Value must be exactly this
   */
  public val fixedSignature: Signature? = null,
  /**
   * Value must be exactly this
   */
  public val fixedTiming: Timing? = null,
  /**
   * Value must be exactly this
   */
  public val fixedContactDetail: ContactDetail? = null,
  /**
   * Value must be exactly this
   */
  public val fixedContributor: Contributor? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDataRequirement: DataRequirement? = null,
  /**
   * Value must be exactly this
   */
  public val fixedExpression: Expression? = null,
  /**
   * Value must be exactly this
   */
  public val fixedParameterDefinition: ParameterDefinition? = null,
  /**
   * Value must be exactly this
   */
  public val fixedRelatedArtifact: RelatedArtifact? = null,
  /**
   * Value must be exactly this
   */
  public val fixedTriggerDefinition: TriggerDefinition? = null,
  /**
   * Value must be exactly this
   */
  public val fixedUsageContext: UsageContext? = null,
  /**
   * Value must be exactly this
   */
  public val fixedDosage: Dosage? = null,
  /**
   * Value must have at least these property values
   */
  public val patternBase64Binary: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternBoolean: Boolean? = null,
  /**
   * Value must have at least these property values
   */
  public val patternCanonical: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternCode: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDate: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDateTime: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDecimal: Float? = null,
  /**
   * Value must have at least these property values
   */
  public val patternId: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternInstant: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternInteger: Int? = null,
  /**
   * Value must have at least these property values
   */
  public val patternMarkdown: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternOid: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternPositiveInt: Int? = null,
  /**
   * Value must have at least these property values
   */
  public val patternString: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternTime: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternUnsignedInt: Int? = null,
  /**
   * Value must have at least these property values
   */
  public val patternUri: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternUrl: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternUuid: String? = null,
  /**
   * Value must have at least these property values
   */
  public val patternAddress: Address? = null,
  /**
   * Value must have at least these property values
   */
  public val patternAge: Age? = null,
  /**
   * Value must have at least these property values
   */
  public val patternAnnotation: Annotation? = null,
  /**
   * Value must have at least these property values
   */
  public val patternAttachment: Attachment? = null,
  /**
   * Value must have at least these property values
   */
  public val patternCodeableConcept: CodeableConcept? = null,
  /**
   * Value must have at least these property values
   */
  public val patternCodeableReference: CodeableReference? = null,
  /**
   * Value must have at least these property values
   */
  public val patternCoding: Coding? = null,
  /**
   * Value must have at least these property values
   */
  public val patternContactPoint: ContactPoint? = null,
  /**
   * Value must have at least these property values
   */
  public val patternCount: Count? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDistance: Distance? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDuration: Duration? = null,
  /**
   * Value must have at least these property values
   */
  public val patternHumanName: HumanName? = null,
  /**
   * Value must have at least these property values
   */
  public val patternIdentifier: Identifier? = null,
  /**
   * Value must have at least these property values
   */
  public val patternMoney: Money? = null,
  /**
   * Value must have at least these property values
   */
  public val patternPeriod: Period? = null,
  /**
   * Value must have at least these property values
   */
  public val patternQuantity: Quantity? = null,
  /**
   * Value must have at least these property values
   */
  public val patternRange: Range? = null,
  /**
   * Value must have at least these property values
   */
  public val patternRatio: Ratio? = null,
  /**
   * Value must have at least these property values
   */
  public val patternRatioRange: RatioRange? = null,
  /**
   * Value must have at least these property values
   */
  public val patternReference: Reference? = null,
  /**
   * Value must have at least these property values
   */
  public val patternSampledData: SampledData? = null,
  /**
   * Value must have at least these property values
   */
  public val patternSignature: Signature? = null,
  /**
   * Value must have at least these property values
   */
  public val patternTiming: Timing? = null,
  /**
   * Value must have at least these property values
   */
  public val patternContactDetail: ContactDetail? = null,
  /**
   * Value must have at least these property values
   */
  public val patternContributor: Contributor? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDataRequirement: DataRequirement? = null,
  /**
   * Value must have at least these property values
   */
  public val patternExpression: Expression? = null,
  /**
   * Value must have at least these property values
   */
  public val patternParameterDefinition: ParameterDefinition? = null,
  /**
   * Value must have at least these property values
   */
  public val patternRelatedArtifact: RelatedArtifact? = null,
  /**
   * Value must have at least these property values
   */
  public val patternTriggerDefinition: TriggerDefinition? = null,
  /**
   * Value must have at least these property values
   */
  public val patternUsageContext: UsageContext? = null,
  /**
   * Value must have at least these property values
   */
  public val patternDosage: Dosage? = null,
  public val example: List<ElementDefinitionExample> = emptyList(),
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueDate: String? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueDateTime: String? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueInstant: String? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueTime: String? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueDecimal: Float? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueInteger: Int? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValuePositiveInt: Int? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueUnsignedInt: Int? = null,
  /**
   * Minimum Allowed Value (for some types)
   */
  public val minValueQuantity: Quantity? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueDate: String? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueDateTime: String? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueInstant: String? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueTime: String? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueDecimal: Float? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueInteger: Int? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValuePositiveInt: Int? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueUnsignedInt: Int? = null,
  /**
   * Maximum Allowed Value (for some types)
   */
  public val maxValueQuantity: Quantity? = null,
  /**
   * Max length for strings
   */
  public val maxLength: Int? = null,
  public val condition: List<String> = emptyList(),
  public val constraint: List<ElementDefinitionConstraint> = emptyList(),
  /**
   * If the element must be supported
   */
  public val mustSupport: Boolean? = null,
  /**
   * If this modifies the meaning of other elements
   */
  public val isModifier: Boolean? = null,
  /**
   * Reason that this element is marked as a modifier
   */
  public val isModifierReason: String? = null,
  /**
   * Include when _summary = true?
   */
  public val isSummary: Boolean? = null,
  /**
   * ValueSet details if this is coded
   */
  public val binding: ElementDefinitionBinding? = null,
  public val mapping: List<ElementDefinitionMapping> = emptyList(),
) : BackboneElement
