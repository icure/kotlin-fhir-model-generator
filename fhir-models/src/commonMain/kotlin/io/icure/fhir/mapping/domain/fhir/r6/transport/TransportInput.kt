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
 * Information used to perform transport
 *
 * Additional information that may be needed in the execution of the transport.
 *
 * @param id Unique id for inter-element referencing
 * @param type Label for the input
 * @param valueBase64Binary Content to use in performing the transport
 * @param valueBoolean Content to use in performing the transport
 * @param valueCanonical Content to use in performing the transport
 * @param valueCode Content to use in performing the transport
 * @param valueDate Content to use in performing the transport
 * @param valueDateTime Content to use in performing the transport
 * @param valueDecimal Content to use in performing the transport
 * @param valueId Content to use in performing the transport
 * @param valueInstant Content to use in performing the transport
 * @param valueInteger Content to use in performing the transport
 * @param valueInteger64 Content to use in performing the transport
 * @param valueMarkdown Content to use in performing the transport
 * @param valueOid Content to use in performing the transport
 * @param valuePositiveInt Content to use in performing the transport
 * @param valueString Content to use in performing the transport
 * @param valueTime Content to use in performing the transport
 * @param valueUnsignedInt Content to use in performing the transport
 * @param valueUri Content to use in performing the transport
 * @param valueUrl Content to use in performing the transport
 * @param valueUuid Content to use in performing the transport
 * @param valueAddress Content to use in performing the transport
 * @param valueAge Content to use in performing the transport
 * @param valueAnnotation Content to use in performing the transport
 * @param valueAttachment Content to use in performing the transport
 * @param valueCodeableConcept Content to use in performing the transport
 * @param valueCodeableReference Content to use in performing the transport
 * @param valueCoding Content to use in performing the transport
 * @param valueContactPoint Content to use in performing the transport
 * @param valueCount Content to use in performing the transport
 * @param valueDistance Content to use in performing the transport
 * @param valueDuration Content to use in performing the transport
 * @param valueHumanName Content to use in performing the transport
 * @param valueIdentifier Content to use in performing the transport
 * @param valueMoney Content to use in performing the transport
 * @param valuePeriod Content to use in performing the transport
 * @param valueQuantity Content to use in performing the transport
 * @param valueRange Content to use in performing the transport
 * @param valueRatio Content to use in performing the transport
 * @param valueRatioRange Content to use in performing the transport
 * @param valueReference Content to use in performing the transport
 * @param valueSampledData Content to use in performing the transport
 * @param valueSignature Content to use in performing the transport
 * @param valueTiming Content to use in performing the transport
 * @param valueContactDetail Content to use in performing the transport
 * @param valueDataRequirement Content to use in performing the transport
 * @param valueExpression Content to use in performing the transport
 * @param valueParameterDefinition Content to use in performing the transport
 * @param valueRelatedArtifact Content to use in performing the transport
 * @param valueTriggerDefinition Content to use in performing the transport
 * @param valueUsageContext Content to use in performing the transport
 * @param valueAvailability Content to use in performing the transport
 * @param valueExtendedContactDetail Content to use in performing the transport
 * @param valueDosage Content to use in performing the transport
 * @param valueMeta Content to use in performing the transport
 */
@SerialName("TransportInput")
@Serializable
public data class TransportInput(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for the input
   */
  public val type: CodeableConcept,
  /**
   * Content to use in performing the transport
   */
  public val valueBase64Binary: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueCanonical: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueCode: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDate: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDateTime: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDecimal: Float? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueId: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueInstant: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueInteger: Int? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueInteger64: Int? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueMarkdown: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueOid: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valuePositiveInt: Int? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueString: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueTime: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueUnsignedInt: Int? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueUri: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueUrl: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueUuid: String? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueAddress: Address? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueAge: Age? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueCodeableReference: CodeableReference? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueCoding: Coding? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueContactPoint: ContactPoint? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueCount: Count? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDistance: Distance? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDuration: Duration? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueHumanName: HumanName? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueMoney: Money? = null,
  /**
   * Content to use in performing the transport
   */
  public val valuePeriod: Period? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueRange: Range? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueRatio: Ratio? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueRatioRange: RatioRange? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueReference: Reference? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueSignature: Signature? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueTiming: Timing? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueContactDetail: ContactDetail? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDataRequirement: DataRequirement? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueExpression: Expression? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueParameterDefinition: ParameterDefinition? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueUsageContext: UsageContext? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueAvailability: Availability? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueExtendedContactDetail: ExtendedContactDetail? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueDosage: Dosage? = null,
  /**
   * Content to use in performing the transport
   */
  public val valueMeta: Meta? = null,
) : BackboneElement
