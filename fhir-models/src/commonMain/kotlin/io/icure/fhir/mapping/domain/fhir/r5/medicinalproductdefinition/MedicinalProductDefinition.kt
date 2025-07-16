//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.marketingstatus.MarketingStatus
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Detailed definition of a medicinal product
 *
 * A medicinal product, being a substance or combination of substances that is intended to treat,
 * prevent or diagnose a disease, or to restore, correct or modify physiological functions by exerting
 * a pharmacological, immunological or metabolic action. This resource is intended to define and detail
 * such products and their properties, for uses other than direct patient care (e.g. regulatory use, or
 * drug catalogs).
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Regulatory type, e.g. Investigational or Authorized
 * @param domain If this medicine applies to human or veterinary uses
 * @param version A business identifier relating to a specific version of the product
 * @param status The status within the lifecycle of this product record
 * @param statusDate The date at which the given status became applicable
 * @param description General description of this product
 * @param combinedPharmaceuticalDoseForm The dose form for a single part product, or combined form
 * of a multiple part product
 * @param indication Description of indication(s) for this product, used when structured indications
 * are not required
 * @param legalStatusOfSupply The legal status of supply of the medicinal product as classified by
 * the regulator
 * @param additionalMonitoringIndicator Whether the Medicinal Product is subject to additional
 * monitoring for regulatory reasons
 * @param pediatricUseIndicator If authorised for use in children
 */
@SerialName("MedicinalProductDefinition")
@Serializable
public data class MedicinalProductDefinition(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Regulatory type, e.g. Investigational or Authorized
   */
  public val type: CodeableConcept? = null,
  /**
   * If this medicine applies to human or veterinary uses
   */
  public val domain: CodeableConcept? = null,
  /**
   * A business identifier relating to a specific version of the product
   */
  public val version: String? = null,
  /**
   * The status within the lifecycle of this product record
   */
  public val status: CodeableConcept? = null,
  /**
   * The date at which the given status became applicable
   */
  public val statusDate: String? = null,
  /**
   * General description of this product
   */
  public val description: String? = null,
  /**
   * The dose form for a single part product, or combined form of a multiple part product
   */
  public val combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  public val route: List<CodeableConcept> = emptyList(),
  /**
   * Description of indication(s) for this product, used when structured indications are not
   * required
   */
  public val indication: String? = null,
  /**
   * The legal status of supply of the medicinal product as classified by the regulator
   */
  public val legalStatusOfSupply: CodeableConcept? = null,
  /**
   * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons
   */
  public val additionalMonitoringIndicator: CodeableConcept? = null,
  public val specialMeasures: List<CodeableConcept> = emptyList(),
  /**
   * If authorised for use in children
   */
  public val pediatricUseIndicator: CodeableConcept? = null,
  public val classification: List<CodeableConcept> = emptyList(),
  public val marketingStatus: List<MarketingStatus> = emptyList(),
  public val packagedMedicinalProduct: List<CodeableConcept> = emptyList(),
  public val comprisedOf: List<Reference> = emptyList(),
  public val ingredient: List<CodeableConcept> = emptyList(),
  public val impurity: List<CodeableReference> = emptyList(),
  public val attachedDocument: List<Reference> = emptyList(),
  public val masterFile: List<Reference> = emptyList(),
  public val contact: List<MedicinalProductDefinitionContact> = emptyList(),
  public val clinicalTrial: List<Reference> = emptyList(),
  public val code: List<Coding> = emptyList(),
  public val name: List<MedicinalProductDefinitionName> = emptyList(),
  public val crossReference: List<MedicinalProductDefinitionCrossReference> = emptyList(),
  public val operation: List<MedicinalProductDefinitionOperation> = emptyList(),
  public val characteristic: List<MedicinalProductDefinitionCharacteristic> = emptyList(),
) : DomainResource
