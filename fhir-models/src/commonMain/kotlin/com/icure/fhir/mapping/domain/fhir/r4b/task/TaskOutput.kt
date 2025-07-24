//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.task

import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.address.Address
import com.icure.fhir.mapping.domain.fhir.r4b.age.Age
import com.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4b.contributor.Contributor
import com.icure.fhir.mapping.domain.fhir.r4b.count.Count
import com.icure.fhir.mapping.domain.fhir.r4b.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r4b.distance.Distance
import com.icure.fhir.mapping.domain.fhir.r4b.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.money.Money
import com.icure.fhir.mapping.domain.fhir.r4b.parameterdefinition.ParameterDefinition
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import com.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r4b.sampleddata.SampledData
import com.icure.fhir.mapping.domain.fhir.r4b.signature.Signature
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r4b.triggerdefinition.TriggerDefinition
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information produced as part of task
 *
 * Outputs produced by the Task.
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
 * @param valueReference Result of output
 * @param valueSampledData Result of output
 * @param valueSignature Result of output
 * @param valueTiming Result of output
 * @param valueContactDetail Result of output
 * @param valueContributor Result of output
 * @param valueDataRequirement Result of output
 * @param valueExpression Result of output
 * @param valueParameterDefinition Result of output
 * @param valueRelatedArtifact Result of output
 * @param valueTriggerDefinition Result of output
 * @param valueUsageContext Result of output
 * @param valueDosage Result of output
 * @param valueMeta Result of output
 */
@SerialName("TaskOutput")
@Serializable
public data class TaskOutput(
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
  public val valueContributor: Contributor? = null,
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
  public val valueDosage: Dosage? = null,
  /**
   * Result of output
   */
  public val valueMeta: Meta? = null,
) : BackboneElement
