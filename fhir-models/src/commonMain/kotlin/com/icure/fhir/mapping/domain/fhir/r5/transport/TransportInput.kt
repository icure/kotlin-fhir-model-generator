//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.transport

import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.address.Address
import com.icure.fhir.mapping.domain.fhir.r5.age.Age
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.availability.Availability
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r5.count.Count
import com.icure.fhir.mapping.domain.fhir.r5.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r5.distance.Distance
import com.icure.fhir.mapping.domain.fhir.r5.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.money.Money
import com.icure.fhir.mapping.domain.fhir.r5.parameterdefinition.ParameterDefinition
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r5.ratiorange.RatioRange
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r5.sampleddata.SampledData
import com.icure.fhir.mapping.domain.fhir.r5.signature.Signature
import com.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r5.triggerdefinition.TriggerDefinition
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
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
