//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.extension

import io.icure.fhir.mapping.domain.fhir.r4b.Element
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.address.Address
import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
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
 * Optional Extensions Element
 *
 * Optional Extension Element - found in all resources.
 *
 * @param id Unique id for inter-element referencing
 * @param url identifies the meaning of the extension
 * @param valueBase64Binary Value of extension
 * @param valueBoolean Value of extension
 * @param valueCanonical Value of extension
 * @param valueCode Value of extension
 * @param valueDate Value of extension
 * @param valueDateTime Value of extension
 * @param valueDecimal Value of extension
 * @param valueId Value of extension
 * @param valueInstant Value of extension
 * @param valueInteger Value of extension
 * @param valueMarkdown Value of extension
 * @param valueOid Value of extension
 * @param valuePositiveInt Value of extension
 * @param valueString Value of extension
 * @param valueTime Value of extension
 * @param valueUnsignedInt Value of extension
 * @param valueUri Value of extension
 * @param valueUrl Value of extension
 * @param valueUuid Value of extension
 * @param valueAddress Value of extension
 * @param valueAge Value of extension
 * @param valueAnnotation Value of extension
 * @param valueAttachment Value of extension
 * @param valueCodeableConcept Value of extension
 * @param valueCodeableReference Value of extension
 * @param valueCoding Value of extension
 * @param valueContactPoint Value of extension
 * @param valueCount Value of extension
 * @param valueDistance Value of extension
 * @param valueDuration Value of extension
 * @param valueHumanName Value of extension
 * @param valueIdentifier Value of extension
 * @param valueMoney Value of extension
 * @param valuePeriod Value of extension
 * @param valueQuantity Value of extension
 * @param valueRange Value of extension
 * @param valueRatio Value of extension
 * @param valueRatioRange Value of extension
 * @param valueReference Value of extension
 * @param valueSampledData Value of extension
 * @param valueSignature Value of extension
 * @param valueTiming Value of extension
 * @param valueContactDetail Value of extension
 * @param valueContributor Value of extension
 * @param valueDataRequirement Value of extension
 * @param valueExpression Value of extension
 * @param valueParameterDefinition Value of extension
 * @param valueRelatedArtifact Value of extension
 * @param valueTriggerDefinition Value of extension
 * @param valueUsageContext Value of extension
 * @param valueDosage Value of extension
 */
@SerialName("Extension")
@Serializable
public data class Extension(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * identifies the meaning of the extension
   */
  public val url: String? = null,
  /**
   * Value of extension
   */
  public val valueBase64Binary: String? = null,
  /**
   * Value of extension
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of extension
   */
  public val valueCanonical: String? = null,
  /**
   * Value of extension
   */
  public val valueCode: String? = null,
  /**
   * Value of extension
   */
  public val valueDate: String? = null,
  /**
   * Value of extension
   */
  public val valueDateTime: String? = null,
  /**
   * Value of extension
   */
  public val valueDecimal: Float? = null,
  /**
   * Value of extension
   */
  public val valueId: String? = null,
  /**
   * Value of extension
   */
  public val valueInstant: String? = null,
  /**
   * Value of extension
   */
  public val valueInteger: Int? = null,
  /**
   * Value of extension
   */
  public val valueMarkdown: String? = null,
  /**
   * Value of extension
   */
  public val valueOid: String? = null,
  /**
   * Value of extension
   */
  public val valuePositiveInt: Int? = null,
  /**
   * Value of extension
   */
  public val valueString: String? = null,
  /**
   * Value of extension
   */
  public val valueTime: String? = null,
  /**
   * Value of extension
   */
  public val valueUnsignedInt: Int? = null,
  /**
   * Value of extension
   */
  public val valueUri: String? = null,
  /**
   * Value of extension
   */
  public val valueUrl: String? = null,
  /**
   * Value of extension
   */
  public val valueUuid: String? = null,
  /**
   * Value of extension
   */
  public val valueAddress: Address? = null,
  /**
   * Value of extension
   */
  public val valueAge: Age? = null,
  /**
   * Value of extension
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * Value of extension
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Value of extension
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value of extension
   */
  public val valueCodeableReference: CodeableReference? = null,
  /**
   * Value of extension
   */
  public val valueCoding: Coding? = null,
  /**
   * Value of extension
   */
  public val valueContactPoint: ContactPoint? = null,
  /**
   * Value of extension
   */
  public val valueCount: Count? = null,
  /**
   * Value of extension
   */
  public val valueDistance: Distance? = null,
  /**
   * Value of extension
   */
  public val valueDuration: Duration? = null,
  /**
   * Value of extension
   */
  public val valueHumanName: HumanName? = null,
  /**
   * Value of extension
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * Value of extension
   */
  public val valueMoney: Money? = null,
  /**
   * Value of extension
   */
  public val valuePeriod: Period? = null,
  /**
   * Value of extension
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value of extension
   */
  public val valueRange: Range? = null,
  /**
   * Value of extension
   */
  public val valueRatio: Ratio? = null,
  /**
   * Value of extension
   */
  public val valueRatioRange: RatioRange? = null,
  /**
   * Value of extension
   */
  public val valueReference: Reference? = null,
  /**
   * Value of extension
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Value of extension
   */
  public val valueSignature: Signature? = null,
  /**
   * Value of extension
   */
  public val valueTiming: Timing? = null,
  /**
   * Value of extension
   */
  public val valueContactDetail: ContactDetail? = null,
  /**
   * Value of extension
   */
  public val valueContributor: Contributor? = null,
  /**
   * Value of extension
   */
  public val valueDataRequirement: DataRequirement? = null,
  /**
   * Value of extension
   */
  public val valueExpression: Expression? = null,
  /**
   * Value of extension
   */
  public val valueParameterDefinition: ParameterDefinition? = null,
  /**
   * Value of extension
   */
  public val valueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Value of extension
   */
  public val valueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Value of extension
   */
  public val valueUsageContext: UsageContext? = null,
  /**
   * Value of extension
   */
  public val valueDosage: Dosage? = null,
) : Element
