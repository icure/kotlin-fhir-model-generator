//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r6.Element
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
import com.icure.fhir.mapping.domain.fhir.r6.distance.Distance
import com.icure.fhir.mapping.domain.fhir.r6.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * Example value (as defined for type)
 *
 * A sample value for this element demonstrating the type of information that would typically be
 * found in the element.
 *
 * @param id Unique id for inter-element referencing
 * @param label Describes the purpose of this example
 * @param valueBase64Binary Value of Example (one of allowed types)
 * @param valueBoolean Value of Example (one of allowed types)
 * @param valueCanonical Value of Example (one of allowed types)
 * @param valueCode Value of Example (one of allowed types)
 * @param valueDate Value of Example (one of allowed types)
 * @param valueDateTime Value of Example (one of allowed types)
 * @param valueDecimal Value of Example (one of allowed types)
 * @param valueId Value of Example (one of allowed types)
 * @param valueInstant Value of Example (one of allowed types)
 * @param valueInteger Value of Example (one of allowed types)
 * @param valueInteger64 Value of Example (one of allowed types)
 * @param valueMarkdown Value of Example (one of allowed types)
 * @param valueOid Value of Example (one of allowed types)
 * @param valuePositiveInt Value of Example (one of allowed types)
 * @param valueString Value of Example (one of allowed types)
 * @param valueTime Value of Example (one of allowed types)
 * @param valueUnsignedInt Value of Example (one of allowed types)
 * @param valueUri Value of Example (one of allowed types)
 * @param valueUrl Value of Example (one of allowed types)
 * @param valueUuid Value of Example (one of allowed types)
 * @param valueAddress Value of Example (one of allowed types)
 * @param valueAge Value of Example (one of allowed types)
 * @param valueAnnotation Value of Example (one of allowed types)
 * @param valueAttachment Value of Example (one of allowed types)
 * @param valueCodeableConcept Value of Example (one of allowed types)
 * @param valueCodeableReference Value of Example (one of allowed types)
 * @param valueCoding Value of Example (one of allowed types)
 * @param valueContactPoint Value of Example (one of allowed types)
 * @param valueCount Value of Example (one of allowed types)
 * @param valueDistance Value of Example (one of allowed types)
 * @param valueDuration Value of Example (one of allowed types)
 * @param valueHumanName Value of Example (one of allowed types)
 * @param valueIdentifier Value of Example (one of allowed types)
 * @param valueMoney Value of Example (one of allowed types)
 * @param valuePeriod Value of Example (one of allowed types)
 * @param valueQuantity Value of Example (one of allowed types)
 * @param valueRange Value of Example (one of allowed types)
 * @param valueRatio Value of Example (one of allowed types)
 * @param valueRatioRange Value of Example (one of allowed types)
 * @param valueReference Value of Example (one of allowed types)
 * @param valueSampledData Value of Example (one of allowed types)
 * @param valueSignature Value of Example (one of allowed types)
 * @param valueTiming Value of Example (one of allowed types)
 * @param valueContactDetail Value of Example (one of allowed types)
 * @param valueDataRequirement Value of Example (one of allowed types)
 * @param valueExpression Value of Example (one of allowed types)
 * @param valueParameterDefinition Value of Example (one of allowed types)
 * @param valueRelatedArtifact Value of Example (one of allowed types)
 * @param valueTriggerDefinition Value of Example (one of allowed types)
 * @param valueUsageContext Value of Example (one of allowed types)
 * @param valueAvailability Value of Example (one of allowed types)
 * @param valueExtendedContactDetail Value of Example (one of allowed types)
 * @param valueDosage Value of Example (one of allowed types)
 * @param valueMeta Value of Example (one of allowed types)
 */
@SerialName("ElementDefinitionExample")
@Serializable
public data class ElementDefinitionExample(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Describes the purpose of this example
   */
  public val label: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueBase64Binary: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueCanonical: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueCode: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDate: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDateTime: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDecimal: Float? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueId: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueInstant: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueInteger: Int? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueInteger64: Int? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueMarkdown: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueOid: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valuePositiveInt: Int? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueString: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueTime: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueUnsignedInt: Int? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueUri: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueUrl: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueUuid: String? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueAddress: Address? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueAge: Age? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueCodeableReference: CodeableReference? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueCoding: Coding? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueContactPoint: ContactPoint? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueCount: Count? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDistance: Distance? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDuration: Duration? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueHumanName: HumanName? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueMoney: Money? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valuePeriod: Period? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueRange: Range? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueRatio: Ratio? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueRatioRange: RatioRange? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueReference: Reference? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueSignature: Signature? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueTiming: Timing? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueContactDetail: ContactDetail? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDataRequirement: DataRequirement? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueExpression: Expression? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueParameterDefinition: ParameterDefinition? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueUsageContext: UsageContext? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueAvailability: Availability? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueExtendedContactDetail: ExtendedContactDetail? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueDosage: Dosage? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueMeta: Meta? = null,
) : Element
