//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.structuremap

import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.address.Address
import com.icure.fhir.mapping.domain.fhir.r4.age.Age
import com.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4.contributor.Contributor
import com.icure.fhir.mapping.domain.fhir.r4.count.Count
import com.icure.fhir.mapping.domain.fhir.r4.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r4.distance.Distance
import com.icure.fhir.mapping.domain.fhir.r4.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.money.Money
import com.icure.fhir.mapping.domain.fhir.r4.parameterdefinition.ParameterDefinition
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import com.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r4.sampleddata.SampledData
import com.icure.fhir.mapping.domain.fhir.r4.signature.Signature
import com.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r4.triggerdefinition.TriggerDefinition
import com.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Source inputs to the mapping
 *
 * Source inputs to the mapping.
 *
 * @param id Unique id for inter-element referencing
 * @param context Type or variable this rule applies to
 * @param min Specified minimum cardinality
 * @param max Specified maximum cardinality (number or *)
 * @param type Rule only applies if source has this type
 * @param defaultValueBase64Binary Default value if no value exists
 * @param defaultValueBoolean Default value if no value exists
 * @param defaultValueCanonical Default value if no value exists
 * @param defaultValueCode Default value if no value exists
 * @param defaultValueDate Default value if no value exists
 * @param defaultValueDateTime Default value if no value exists
 * @param defaultValueDecimal Default value if no value exists
 * @param defaultValueId Default value if no value exists
 * @param defaultValueInstant Default value if no value exists
 * @param defaultValueInteger Default value if no value exists
 * @param defaultValueMarkdown Default value if no value exists
 * @param defaultValueOid Default value if no value exists
 * @param defaultValuePositiveInt Default value if no value exists
 * @param defaultValueString Default value if no value exists
 * @param defaultValueTime Default value if no value exists
 * @param defaultValueUnsignedInt Default value if no value exists
 * @param defaultValueUri Default value if no value exists
 * @param defaultValueUrl Default value if no value exists
 * @param defaultValueUuid Default value if no value exists
 * @param defaultValueAddress Default value if no value exists
 * @param defaultValueAge Default value if no value exists
 * @param defaultValueAnnotation Default value if no value exists
 * @param defaultValueAttachment Default value if no value exists
 * @param defaultValueCodeableConcept Default value if no value exists
 * @param defaultValueCoding Default value if no value exists
 * @param defaultValueContactPoint Default value if no value exists
 * @param defaultValueCount Default value if no value exists
 * @param defaultValueDistance Default value if no value exists
 * @param defaultValueDuration Default value if no value exists
 * @param defaultValueHumanName Default value if no value exists
 * @param defaultValueIdentifier Default value if no value exists
 * @param defaultValueMoney Default value if no value exists
 * @param defaultValuePeriod Default value if no value exists
 * @param defaultValueQuantity Default value if no value exists
 * @param defaultValueRange Default value if no value exists
 * @param defaultValueRatio Default value if no value exists
 * @param defaultValueReference Default value if no value exists
 * @param defaultValueSampledData Default value if no value exists
 * @param defaultValueSignature Default value if no value exists
 * @param defaultValueTiming Default value if no value exists
 * @param defaultValueContactDetail Default value if no value exists
 * @param defaultValueContributor Default value if no value exists
 * @param defaultValueDataRequirement Default value if no value exists
 * @param defaultValueExpression Default value if no value exists
 * @param defaultValueParameterDefinition Default value if no value exists
 * @param defaultValueRelatedArtifact Default value if no value exists
 * @param defaultValueTriggerDefinition Default value if no value exists
 * @param defaultValueUsageContext Default value if no value exists
 * @param defaultValueDosage Default value if no value exists
 * @param defaultValueMeta Default value if no value exists
 * @param element Optional field for this source
 * @param listMode first | not_first | last | not_last | only_one
 * @param variable Named context for field, if a field is specified
 * @param condition FHIRPath expression  - must be true or the rule does not apply
 * @param check FHIRPath expression  - must be true or the mapping engine throws an error instead of
 * completing
 * @param logMessage Message to put in log if source exists (FHIRPath)
 */
@SerialName("StructureMapGroupRuleSource")
@Serializable
public data class StructureMapGroupRuleSource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type or variable this rule applies to
   */
  public val context: String? = null,
  /**
   * Specified minimum cardinality
   */
  public val min: Int? = null,
  /**
   * Specified maximum cardinality (number or *)
   */
  public val max: String? = null,
  /**
   * Rule only applies if source has this type
   */
  public val type: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueBase64Binary: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueBoolean: Boolean? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueCanonical: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueCode: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDate: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDateTime: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDecimal: Float? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueId: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueInstant: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueInteger: Int? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueMarkdown: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueOid: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValuePositiveInt: Int? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueString: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueTime: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueUnsignedInt: Int? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueUri: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueUrl: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueUuid: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueAddress: Address? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueAge: Age? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueAnnotation: Annotation? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueAttachment: Attachment? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueCodeableConcept: CodeableConcept? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueCoding: Coding? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueContactPoint: ContactPoint? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueCount: Count? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDistance: Distance? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDuration: Duration? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueHumanName: HumanName? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueIdentifier: Identifier? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueMoney: Money? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValuePeriod: Period? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueQuantity: Quantity? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueRange: Range? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueRatio: Ratio? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueReference: Reference? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueSampledData: SampledData? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueSignature: Signature? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueTiming: Timing? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueContactDetail: ContactDetail? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueContributor: Contributor? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDataRequirement: DataRequirement? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueExpression: Expression? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueParameterDefinition: ParameterDefinition? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueRelatedArtifact: RelatedArtifact? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueTriggerDefinition: TriggerDefinition? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueUsageContext: UsageContext? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueDosage: Dosage? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValueMeta: Meta? = null,
  /**
   * Optional field for this source
   */
  public val element: String? = null,
  /**
   * first | not_first | last | not_last | only_one
   */
  public val listMode: String? = null,
  /**
   * Named context for field, if a field is specified
   */
  public val variable: String? = null,
  /**
   * FHIRPath expression  - must be true or the rule does not apply
   */
  public val condition: String? = null,
  /**
   * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing
   */
  public val check: String? = null,
  /**
   * Message to put in log if source exists (FHIRPath)
   */
  public val logMessage: String? = null,
) : BackboneElement
