//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.catalogentry

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An entry in a catalog
 *
 * Catalog entries are wrappers that contextualize items included in a catalog.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type The type of item - medication, device, service, protocol or other
 * @param orderable Whether the entry represents an orderable item
 * @param referencedItem The item that is being defined
 * @param status draft | active | retired | unknown
 * @param validityPeriod The time period in which this catalog entry is expected to be active
 * @param validTo The date until which this catalog entry is expected to be active
 * @param lastUpdated When was this catalog last updated
 */
@SerialName("CatalogEntry")
@Serializable
public data class CatalogEntry(
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
   * The type of item - medication, device, service, protocol or other
   */
  public val type: CodeableConcept? = null,
  /**
   * Whether the entry represents an orderable item
   */
  public val orderable: Boolean? = null,
  /**
   * The item that is being defined
   */
  public val referencedItem: Reference,
  public val additionalIdentifier: List<Identifier> = emptyList(),
  public val classification: List<CodeableConcept> = emptyList(),
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * The time period in which this catalog entry is expected to be active
   */
  public val validityPeriod: Period? = null,
  /**
   * The date until which this catalog entry is expected to be active
   */
  public val validTo: String? = null,
  /**
   * When was this catalog last updated
   */
  public val lastUpdated: String? = null,
  public val additionalCharacteristic: List<CodeableConcept> = emptyList(),
  public val additionalClassification: List<CodeableConcept> = emptyList(),
  public val relatedEntry: List<CatalogEntryRelatedEntry> = emptyList(),
) : DomainResource
