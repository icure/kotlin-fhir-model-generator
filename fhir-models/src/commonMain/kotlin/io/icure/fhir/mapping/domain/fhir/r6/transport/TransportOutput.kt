//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.transport

import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.address.Address
import io.icure.fhir.mapping.domain.fhir.r6.age.Age
import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.availability.Availability
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r6.count.Count
import io.icure.fhir.mapping.domain.fhir.r6.datarequirement.DataRequirement
import io.icure.fhir.mapping.domain.fhir.r6.distance.Distance
import io.icure.fhir.mapping.domain.fhir.r6.dosage.Dosage
import io.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.humanname.HumanName
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.money.Money
import io.icure.fhir.mapping.domain.fhir.r6.parameterdefinition.ParameterDefinition
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import io.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r6.ratiorange.RatioRange
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r6.sampleddata.SampledData
import io.icure.fhir.mapping.domain.fhir.r6.signature.Signature
import io.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import io.icure.fhir.mapping.domain.fhir.r6.triggerdefinition.TriggerDefinition
import io.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information produced as part of transport
 *
 * Outputs produced by the Transport.
 *
 * @param id Unique id for inter-element referencing
 * @param type Label for output
 * @param valueBase64Binary Result of output
 * @param valueBoolean Result of output
 * @param valueCanonical Result of output
 * @param valueCode Result of output
 * @param valueDate Result of output
 * @param valueDateTime Result of output
 * @param valueDecimal Result of output
 * @param valueId Result of output
 * @param valueInstant Result of output
 * @param valueInteger Result of output
 * @param valueInteger64 Result of output
 * @param valueMarkdown Result of output
 * @param valueOid Result of output
 * @param valuePositiveInt Result of output
 * @param valueString Result of output
 * @param valueTime Result of output
 * @param valueUnsignedInt Result of output
 * @param valueUri Result of output
 * @param valueUrl Result of output
 * @param valueUuid Result of output
 * @param valueAddress Result of output
 * @param valueAge Result of output
 * @param valueAnnotation Result of output
 * @param valueAttachment Result of output
 * @param valueCodeableConcept Result of output
 * @param valueCodeableReference Result of output
 * @param valueCoding Result of output
 * @param valueContactPoint Result of output
 * @param valueCount Result of output
 * @param valueDistance Result of output
 * @param valueDuration Result of output
 * @param valueHumanName Result of output
 * @param valueIdentifier Result of output
 * @param valueMoney Result of output
 * @param valuePeriod Result of output
 * @param valueQuantity Result of output
 * @param valueRange Result of output
 * @param valueRatio Result of output
 * @param valueRatioRange Result of output
 * @param valueReference Result of output
 * @param valueSampledData Result of output
 * @param valueSignature Result of output
 * @param valueTiming Result of output
 * @param valueContactDetail Result of output
 * @param valueDataRequirement Result of output
 * @param valueExpression Result of output
 * @param valueParameterDefinition Result of output
 * @param valueRelatedArtifact Result of output
 * @param valueTriggerDefinition Result of output
 * @param valueUsageContext Result of output
 * @param valueAvailability Result of output
 * @param valueExtendedContactDetail Result of output
 * @param valueDosage Result of output
 * @param valueMeta Result of output
 */
@SerialName("TransportOutput")
@Serializable
public data class TransportOutput(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for output
   */
  public val type: CodeableConcept,
  /**
   * Result of output
   */
  public val valueBase64Binary: String? = null,
  /**
   * Result of output
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Result of output
   */
  public val valueCanonical: String? = null,
  /**
   * Result of output
   */
  public val valueCode: String? = null,
  /**
   * Result of output
   */
  public val valueDate: String? = null,
  /**
   * Result of output
   */
  public val valueDateTime: String? = null,
  /**
   * Result of output
   */
  public val valueDecimal: Float? = null,
  /**
   * Result of output
   */
  public val valueId: String? = null,
  /**
   * Result of output
   */
  public val valueInstant: String? = null,
  /**
   * Result of output
   */
  public val valueInteger: Int? = null,
  /**
   * Result of output
   */
  public val valueInteger64: Int? = null,
  /**
   * Result of output
   */
  public val valueMarkdown: String? = null,
  /**
   * Result of output
   */
  public val valueOid: String? = null,
  /**
   * Result of output
   */
  public val valuePositiveInt: Int? = null,
  /**
   * Result of output
   */
  public val valueString: String? = null,
  /**
   * Result of output
   */
  public val valueTime: String? = null,
  /**
   * Result of output
   */
  public val valueUnsignedInt: Int? = null,
  /**
   * Result of output
   */
  public val valueUri: String? = null,
  /**
   * Result of output
   */
  public val valueUrl: String? = null,
  /**
   * Result of output
   */
  public val valueUuid: String? = null,
  /**
   * Result of output
   */
  public val valueAddress: Address? = null,
  /**
   * Result of output
   */
  public val valueAge: Age? = null,
  /**
   * Result of output
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * Result of output
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Result of output
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Result of output
   */
  public val valueCodeableReference: CodeableReference? = null,
  /**
   * Result of output
   */
  public val valueCoding: Coding? = null,
  /**
   * Result of output
   */
  public val valueContactPoint: ContactPoint? = null,
  /**
   * Result of output
   */
  public val valueCount: Count? = null,
  /**
   * Result of output
   */
  public val valueDistance: Distance? = null,
  /**
   * Result of output
   */
  public val valueDuration: Duration? = null,
  /**
   * Result of output
   */
  public val valueHumanName: HumanName? = null,
  /**
   * Result of output
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * Result of output
   */
  public val valueMoney: Money? = null,
  /**
   * Result of output
   */
  public val valuePeriod: Period? = null,
  /**
   * Result of output
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Result of output
   */
  public val valueRange: Range? = null,
  /**
   * Result of output
   */
  public val valueRatio: Ratio? = null,
  /**
   * Result of output
   */
  public val valueRatioRange: RatioRange? = null,
  /**
   * Result of output
   */
  public val valueReference: Reference? = null,
  /**
   * Result of output
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Result of output
   */
  public val valueSignature: Signature? = null,
  /**
   * Result of output
   */
  public val valueTiming: Timing? = null,
  /**
   * Result of output
   */
  public val valueContactDetail: ContactDetail? = null,
  /**
   * Result of output
   */
  public val valueDataRequirement: DataRequirement? = null,
  /**
   * Result of output
   */
  public val valueExpression: Expression? = null,
  /**
   * Result of output
   */
  public val valueParameterDefinition: ParameterDefinition? = null,
  /**
   * Result of output
   */
  public val valueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Result of output
   */
  public val valueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Result of output
   */
  public val valueUsageContext: UsageContext? = null,
  /**
   * Result of output
   */
  public val valueAvailability: Availability? = null,
  /**
   * Result of output
   */
  public val valueExtendedContactDetail: ExtendedContactDetail? = null,
  /**
   * Result of output
   */
  public val valueDosage: Dosage? = null,
  /**
   * Result of output
   */
  public val valueMeta: Meta? = null,
) : BackboneElement
