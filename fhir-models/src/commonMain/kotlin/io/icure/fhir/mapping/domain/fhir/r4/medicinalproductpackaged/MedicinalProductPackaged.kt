//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpackaged

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.marketingstatus.MarketingStatus
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A medicinal product in a container or package
 *
 * A medicinal product in a container or package.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param description Textual description
 * @param legalStatusOfSupply The legal status of supply of the medicinal product as classified by
 * the regulator
 * @param marketingAuthorization Manufacturer of this Package Item
 */
@SerialName("MedicinalProductPackaged")
@Serializable
public data class MedicinalProductPackaged(
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
  public val subject: List<Reference> = emptyList(),
  /**
   * Textual description
   */
  public val description: String? = null,
  /**
   * The legal status of supply of the medicinal product as classified by the regulator
   */
  public val legalStatusOfSupply: CodeableConcept? = null,
  public val marketingStatus: List<MarketingStatus> = emptyList(),
  /**
   * Manufacturer of this Package Item
   */
  public val marketingAuthorization: Reference? = null,
  public val manufacturer: List<Reference> = emptyList(),
  public val batchIdentifier: List<MedicinalProductPackagedBatchIdentifier> = emptyList(),
  public val packageItem: List<MedicinalProductPackagedPackageItem> = emptyList(),
) : DomainResource
