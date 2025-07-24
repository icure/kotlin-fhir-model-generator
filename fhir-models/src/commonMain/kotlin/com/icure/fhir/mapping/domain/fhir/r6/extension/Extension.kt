//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.extension

import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.address.Address
import com.icure.fhir.mapping.domain.fhir.r6.age.Age
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.availability.Availability
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.count.Count
import com.icure.fhir.mapping.domain.fhir.r6.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r6.distance.Distance
import com.icure.fhir.mapping.domain.fhir.r6.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.money.Money
import com.icure.fhir.mapping.domain.fhir.r6.parameterdefinition.ParameterDefinition
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r6.ratiorange.RatioRange
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r6.sampleddata.SampledData
import com.icure.fhir.mapping.domain.fhir.r6.signature.Signature
import com.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r6.triggerdefinition.TriggerDefinition
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
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
 * @param valueInteger64 Value of extension
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
 * @param valueDataRequirement Value of extension
 * @param valueExpression Value of extension
 * @param valueParameterDefinition Value of extension
 * @param valueRelatedArtifact Value of extension
 * @param valueTriggerDefinition Value of extension
 * @param valueUsageContext Value of extension
 * @param valueAvailability Value of extension
 * @param valueExtendedContactDetail Value of extension
 * @param valueDosage Value of extension
 * @param valueMeta Value of extension
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
  public val valueInteger64: Int? = null,
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
  public val valueAvailability: Availability? = null,
  /**
   * Value of extension
   */
  public val valueExtendedContactDetail: ExtendedContactDetail? = null,
  /**
   * Value of extension
   */
  public val valueDosage: Dosage? = null,
  /**
   * Value of extension
   */
  public val valueMeta: Meta? = null,
) : DataType
