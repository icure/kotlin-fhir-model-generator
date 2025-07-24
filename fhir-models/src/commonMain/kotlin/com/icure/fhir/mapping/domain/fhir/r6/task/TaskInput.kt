//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.task

import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.address.Address
import com.icure.fhir.mapping.domain.fhir.r6.age.Age
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.availability.Availability
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
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
 * Information used to perform task
 *
 * Additional information that may be needed in the execution of the task.
 *
 * @param id Unique id for inter-element referencing
 * @param type Label for the input
 * @param valueBase64Binary Content to use in performing the task
 * @param valueBoolean Content to use in performing the task
 * @param valueCanonical Content to use in performing the task
 * @param valueCode Content to use in performing the task
 * @param valueDate Content to use in performing the task
 * @param valueDateTime Content to use in performing the task
 * @param valueDecimal Content to use in performing the task
 * @param valueId Content to use in performing the task
 * @param valueInstant Content to use in performing the task
 * @param valueInteger Content to use in performing the task
 * @param valueInteger64 Content to use in performing the task
 * @param valueMarkdown Content to use in performing the task
 * @param valueOid Content to use in performing the task
 * @param valuePositiveInt Content to use in performing the task
 * @param valueString Content to use in performing the task
 * @param valueTime Content to use in performing the task
 * @param valueUnsignedInt Content to use in performing the task
 * @param valueUri Content to use in performing the task
 * @param valueUrl Content to use in performing the task
 * @param valueUuid Content to use in performing the task
 * @param valueAddress Content to use in performing the task
 * @param valueAge Content to use in performing the task
 * @param valueAnnotation Content to use in performing the task
 * @param valueAttachment Content to use in performing the task
 * @param valueCodeableConcept Content to use in performing the task
 * @param valueCodeableReference Content to use in performing the task
 * @param valueCoding Content to use in performing the task
 * @param valueContactPoint Content to use in performing the task
 * @param valueCount Content to use in performing the task
 * @param valueDistance Content to use in performing the task
 * @param valueDuration Content to use in performing the task
 * @param valueHumanName Content to use in performing the task
 * @param valueIdentifier Content to use in performing the task
 * @param valueMoney Content to use in performing the task
 * @param valuePeriod Content to use in performing the task
 * @param valueQuantity Content to use in performing the task
 * @param valueRange Content to use in performing the task
 * @param valueRatio Content to use in performing the task
 * @param valueRatioRange Content to use in performing the task
 * @param valueReference Content to use in performing the task
 * @param valueSampledData Content to use in performing the task
 * @param valueSignature Content to use in performing the task
 * @param valueTiming Content to use in performing the task
 * @param valueContactDetail Content to use in performing the task
 * @param valueDataRequirement Content to use in performing the task
 * @param valueExpression Content to use in performing the task
 * @param valueParameterDefinition Content to use in performing the task
 * @param valueRelatedArtifact Content to use in performing the task
 * @param valueTriggerDefinition Content to use in performing the task
 * @param valueUsageContext Content to use in performing the task
 * @param valueAvailability Content to use in performing the task
 * @param valueExtendedContactDetail Content to use in performing the task
 * @param valueDosage Content to use in performing the task
 * @param valueMeta Content to use in performing the task
 */
@SerialName("TaskInput")
@Serializable
public data class TaskInput(
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
   * Content to use in performing the task
   */
  public val valueBase64Binary: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Content to use in performing the task
   */
  public val valueCanonical: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueCode: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDate: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDateTime: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDecimal: Float? = null,
  /**
   * Content to use in performing the task
   */
  public val valueId: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueInstant: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueInteger: Int? = null,
  /**
   * Content to use in performing the task
   */
  public val valueInteger64: Int? = null,
  /**
   * Content to use in performing the task
   */
  public val valueMarkdown: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueOid: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valuePositiveInt: Int? = null,
  /**
   * Content to use in performing the task
   */
  public val valueString: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueTime: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueUnsignedInt: Int? = null,
  /**
   * Content to use in performing the task
   */
  public val valueUri: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueUrl: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueUuid: String? = null,
  /**
   * Content to use in performing the task
   */
  public val valueAddress: Address? = null,
  /**
   * Content to use in performing the task
   */
  public val valueAge: Age? = null,
  /**
   * Content to use in performing the task
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * Content to use in performing the task
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Content to use in performing the task
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Content to use in performing the task
   */
  public val valueCodeableReference: CodeableReference? = null,
  /**
   * Content to use in performing the task
   */
  public val valueCoding: Coding? = null,
  /**
   * Content to use in performing the task
   */
  public val valueContactPoint: ContactPoint? = null,
  /**
   * Content to use in performing the task
   */
  public val valueCount: Count? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDistance: Distance? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDuration: Duration? = null,
  /**
   * Content to use in performing the task
   */
  public val valueHumanName: HumanName? = null,
  /**
   * Content to use in performing the task
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * Content to use in performing the task
   */
  public val valueMoney: Money? = null,
  /**
   * Content to use in performing the task
   */
  public val valuePeriod: Period? = null,
  /**
   * Content to use in performing the task
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Content to use in performing the task
   */
  public val valueRange: Range? = null,
  /**
   * Content to use in performing the task
   */
  public val valueRatio: Ratio? = null,
  /**
   * Content to use in performing the task
   */
  public val valueRatioRange: RatioRange? = null,
  /**
   * Content to use in performing the task
   */
  public val valueReference: Reference? = null,
  /**
   * Content to use in performing the task
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Content to use in performing the task
   */
  public val valueSignature: Signature? = null,
  /**
   * Content to use in performing the task
   */
  public val valueTiming: Timing? = null,
  /**
   * Content to use in performing the task
   */
  public val valueContactDetail: ContactDetail? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDataRequirement: DataRequirement? = null,
  /**
   * Content to use in performing the task
   */
  public val valueExpression: Expression? = null,
  /**
   * Content to use in performing the task
   */
  public val valueParameterDefinition: ParameterDefinition? = null,
  /**
   * Content to use in performing the task
   */
  public val valueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Content to use in performing the task
   */
  public val valueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Content to use in performing the task
   */
  public val valueUsageContext: UsageContext? = null,
  /**
   * Content to use in performing the task
   */
  public val valueAvailability: Availability? = null,
  /**
   * Content to use in performing the task
   */
  public val valueExtendedContactDetail: ExtendedContactDetail? = null,
  /**
   * Content to use in performing the task
   */
  public val valueDosage: Dosage? = null,
  /**
   * Content to use in performing the task
   */
  public val valueMeta: Meta? = null,
) : BackboneElement
