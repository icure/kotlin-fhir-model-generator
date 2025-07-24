//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproduct

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.marketingstatus.MarketingStatus
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Detailed definition of a medicinal product, typically for uses other than direct patient care
 * (e.g. regulatory use)
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care
 * (e.g. regulatory use).
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Regulatory type, e.g. Investigational or Authorized
 * @param domain If this medicine applies to human or veterinary uses
 * @param combinedPharmaceuticalDoseForm The dose form for a single part product, or combined form
 * of a multiple part product
 * @param legalStatusOfSupply The legal status of supply of the medicinal product as classified by
 * the regulator
 * @param additionalMonitoringIndicator Whether the Medicinal Product is subject to additional
 * monitoring for regulatory reasons
 * @param paediatricUseIndicator If authorised for use in children
 */
@SerialName("MedicinalProduct")
@Serializable
public data class MedicinalProduct(
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
  public val domain: Coding? = null,
  /**
   * The dose form for a single part product, or combined form of a multiple part product
   */
  public val combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  /**
   * The legal status of supply of the medicinal product as classified by the regulator
   */
  public val legalStatusOfSupply: CodeableConcept? = null,
  /**
   * Whether the Medicinal Product is subject to additional monitoring for regulatory reasons
   */
  public val additionalMonitoringIndicator: CodeableConcept? = null,
  public val specialMeasures: List<String> = emptyList(),
  /**
   * If authorised for use in children
   */
  public val paediatricUseIndicator: CodeableConcept? = null,
  public val productClassification: List<CodeableConcept> = emptyList(),
  public val marketingStatus: List<MarketingStatus> = emptyList(),
  public val pharmaceuticalProduct: List<Reference> = emptyList(),
  public val packagedMedicinalProduct: List<Reference> = emptyList(),
  public val attachedDocument: List<Reference> = emptyList(),
  public val masterFile: List<Reference> = emptyList(),
  public val contact: List<Reference> = emptyList(),
  public val clinicalTrial: List<Reference> = emptyList(),
  public val name: List<MedicinalProductName> = emptyList(),
  public val crossReference: List<Identifier> = emptyList(),
  public val manufacturingBusinessOperation: List<MedicinalProductManufacturingBusinessOperation> =
      emptyList(),
  public val specialDesignation: List<MedicinalProductSpecialDesignation> = emptyList(),
) : DomainResource
