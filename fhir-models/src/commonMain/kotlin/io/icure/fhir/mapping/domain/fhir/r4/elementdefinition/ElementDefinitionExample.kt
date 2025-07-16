//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.elementdefinition

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4.address.Address
import io.icure.fhir.mapping.domain.fhir.r4.age.Age
import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4.contributor.Contributor
import io.icure.fhir.mapping.domain.fhir.r4.count.Count
import io.icure.fhir.mapping.domain.fhir.r4.datarequirement.DataRequirement
import io.icure.fhir.mapping.domain.fhir.r4.distance.Distance
import io.icure.fhir.mapping.domain.fhir.r4.dosage.Dosage
import io.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.humanname.HumanName
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.money.Money
import io.icure.fhir.mapping.domain.fhir.r4.parameterdefinition.ParameterDefinition
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import io.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4.sampleddata.SampledData
import io.icure.fhir.mapping.domain.fhir.r4.signature.Signature
import io.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import io.icure.fhir.mapping.domain.fhir.r4.triggerdefinition.TriggerDefinition
import io.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
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
 * @param valueReference Value of Example (one of allowed types)
 * @param valueSampledData Value of Example (one of allowed types)
 * @param valueSignature Value of Example (one of allowed types)
 * @param valueTiming Value of Example (one of allowed types)
 * @param valueContactDetail Value of Example (one of allowed types)
 * @param valueContributor Value of Example (one of allowed types)
 * @param valueDataRequirement Value of Example (one of allowed types)
 * @param valueExpression Value of Example (one of allowed types)
 * @param valueParameterDefinition Value of Example (one of allowed types)
 * @param valueRelatedArtifact Value of Example (one of allowed types)
 * @param valueTriggerDefinition Value of Example (one of allowed types)
 * @param valueUsageContext Value of Example (one of allowed types)
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
  public val valueContributor: Contributor? = null,
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
  public val valueDosage: Dosage? = null,
  /**
   * Value of Example (one of allowed types)
   */
  public val valueMeta: Meta? = null,
) : Element
