//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.contract

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract precursor content
 *
 * Precusory content developed with a focus and intent of supporting the formation a Contract
 * instance, which may be associated with and transformable into a Contract.
 *
 * @param id Unique id for inter-element referencing
 * @param type Content structure and use
 * @param subType Detailed Content Type Definition
 * @param publisher Publisher Entity
 * @param publicationDate When published
 * @param publicationStatus amended | appended | cancelled | disputed | entered-in-error |
 * executable +
 * @param copyright Publication Ownership
 */
@SerialName("ContractContentDefinition")
@Serializable
public data class ContractContentDefinition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Content structure and use
   */
  public val type: CodeableConcept,
  /**
   * Detailed Content Type Definition
   */
  public val subType: CodeableConcept? = null,
  /**
   * Publisher Entity
   */
  public val publisher: Reference? = null,
  /**
   * When published
   */
  public val publicationDate: String? = null,
  /**
   * amended | appended | cancelled | disputed | entered-in-error | executable +
   */
  public val publicationStatus: String? = null,
  /**
   * Publication Ownership
   */
  public val copyright: String? = null,
) : BackboneElement
