//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.parameters

import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.address.Address
import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
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
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.humanname.HumanName
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.money.Money
import io.icure.fhir.mapping.domain.fhir.r4b.parameterdefinition.ParameterDefinition
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
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
 * Operation Parameter
 *
 * A parameter passed to or received from the operation.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name from the definition
 * @param valueBase64Binary If parameter is a data type
 * @param valueBoolean If parameter is a data type
 * @param valueCanonical If parameter is a data type
 * @param valueCode If parameter is a data type
 * @param valueDate If parameter is a data type
 * @param valueDateTime If parameter is a data type
 * @param valueDecimal If parameter is a data type
 * @param valueId If parameter is a data type
 * @param valueInstant If parameter is a data type
 * @param valueInteger If parameter is a data type
 * @param valueMarkdown If parameter is a data type
 * @param valueOid If parameter is a data type
 * @param valuePositiveInt If parameter is a data type
 * @param valueString If parameter is a data type
 * @param valueTime If parameter is a data type
 * @param valueUnsignedInt If parameter is a data type
 * @param valueUri If parameter is a data type
 * @param valueUrl If parameter is a data type
 * @param valueUuid If parameter is a data type
 * @param valueAddress If parameter is a data type
 * @param valueAge If parameter is a data type
 * @param valueAnnotation If parameter is a data type
 * @param valueAttachment If parameter is a data type
 * @param valueCodeableConcept If parameter is a data type
 * @param valueCoding If parameter is a data type
 * @param valueContactPoint If parameter is a data type
 * @param valueCount If parameter is a data type
 * @param valueDistance If parameter is a data type
 * @param valueDuration If parameter is a data type
 * @param valueHumanName If parameter is a data type
 * @param valueIdentifier If parameter is a data type
 * @param valueMoney If parameter is a data type
 * @param valuePeriod If parameter is a data type
 * @param valueQuantity If parameter is a data type
 * @param valueRange If parameter is a data type
 * @param valueRatio If parameter is a data type
 * @param valueReference If parameter is a data type
 * @param valueSampledData If parameter is a data type
 * @param valueSignature If parameter is a data type
 * @param valueTiming If parameter is a data type
 * @param valueContactDetail If parameter is a data type
 * @param valueContributor If parameter is a data type
 * @param valueDataRequirement If parameter is a data type
 * @param valueExpression If parameter is a data type
 * @param valueParameterDefinition If parameter is a data type
 * @param valueRelatedArtifact If parameter is a data type
 * @param valueTriggerDefinition If parameter is a data type
 * @param valueUsageContext If parameter is a data type
 * @param valueDosage If parameter is a data type
 * @param valueMeta If parameter is a data type
 * @param resource If parameter is a whole resource
 */
@SerialName("ParametersParameter")
@Serializable
public data class ParametersParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name from the definition
   */
  public val name: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueBase64Binary: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueBoolean: Boolean? = null,
  /**
   * If parameter is a data type
   */
  public val valueCanonical: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueCode: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueDate: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueDateTime: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueDecimal: Float? = null,
  /**
   * If parameter is a data type
   */
  public val valueId: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueInstant: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueInteger: Int? = null,
  /**
   * If parameter is a data type
   */
  public val valueMarkdown: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueOid: String? = null,
  /**
   * If parameter is a data type
   */
  public val valuePositiveInt: Int? = null,
  /**
   * If parameter is a data type
   */
  public val valueString: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueTime: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueUnsignedInt: Int? = null,
  /**
   * If parameter is a data type
   */
  public val valueUri: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueUrl: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueUuid: String? = null,
  /**
   * If parameter is a data type
   */
  public val valueAddress: Address? = null,
  /**
   * If parameter is a data type
   */
  public val valueAge: Age? = null,
  /**
   * If parameter is a data type
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * If parameter is a data type
   */
  public val valueAttachment: Attachment? = null,
  /**
   * If parameter is a data type
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * If parameter is a data type
   */
  public val valueCoding: Coding? = null,
  /**
   * If parameter is a data type
   */
  public val valueContactPoint: ContactPoint? = null,
  /**
   * If parameter is a data type
   */
  public val valueCount: Count? = null,
  /**
   * If parameter is a data type
   */
  public val valueDistance: Distance? = null,
  /**
   * If parameter is a data type
   */
  public val valueDuration: Duration? = null,
  /**
   * If parameter is a data type
   */
  public val valueHumanName: HumanName? = null,
  /**
   * If parameter is a data type
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * If parameter is a data type
   */
  public val valueMoney: Money? = null,
  /**
   * If parameter is a data type
   */
  public val valuePeriod: Period? = null,
  /**
   * If parameter is a data type
   */
  public val valueQuantity: Quantity? = null,
  /**
   * If parameter is a data type
   */
  public val valueRange: Range? = null,
  /**
   * If parameter is a data type
   */
  public val valueRatio: Ratio? = null,
  /**
   * If parameter is a data type
   */
  public val valueReference: Reference? = null,
  /**
   * If parameter is a data type
   */
  public val valueSampledData: SampledData? = null,
  /**
   * If parameter is a data type
   */
  public val valueSignature: Signature? = null,
  /**
   * If parameter is a data type
   */
  public val valueTiming: Timing? = null,
  /**
   * If parameter is a data type
   */
  public val valueContactDetail: ContactDetail? = null,
  /**
   * If parameter is a data type
   */
  public val valueContributor: Contributor? = null,
  /**
   * If parameter is a data type
   */
  public val valueDataRequirement: DataRequirement? = null,
  /**
   * If parameter is a data type
   */
  public val valueExpression: Expression? = null,
  /**
   * If parameter is a data type
   */
  public val valueParameterDefinition: ParameterDefinition? = null,
  /**
   * If parameter is a data type
   */
  public val valueRelatedArtifact: RelatedArtifact? = null,
  /**
   * If parameter is a data type
   */
  public val valueTriggerDefinition: TriggerDefinition? = null,
  /**
   * If parameter is a data type
   */
  public val valueUsageContext: UsageContext? = null,
  /**
   * If parameter is a data type
   */
  public val valueDosage: Dosage? = null,
  /**
   * If parameter is a data type
   */
  public val valueMeta: Meta? = null,
  /**
   * If parameter is a whole resource
   */
  public val resource: Resource? = null,
  public val part: List<ParametersParameter> = emptyList(),
) : BackboneElement
