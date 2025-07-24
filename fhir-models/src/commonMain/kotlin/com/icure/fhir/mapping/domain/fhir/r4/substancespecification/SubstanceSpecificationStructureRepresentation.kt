//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancespecification

import com.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Molecular structural representation
 *
 * Molecular structural representation.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of structure (e.g. Full, Partial, Representative)
 * @param representation The structural representation as text string in a format e.g. InChI,
 * SMILES, MOLFILE, CDX
 * @param attachment An attached file with the structural representation
 */
@SerialName("SubstanceSpecificationStructureRepresentation")
@Serializable
public data class SubstanceSpecificationStructureRepresentation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of structure (e.g. Full, Partial, Representative)
   */
  public val type: CodeableConcept? = null,
  /**
   * The structural representation as text string in a format e.g. InChI, SMILES, MOLFILE, CDX
   */
  public val representation: String? = null,
  /**
   * An attached file with the structural representation
   */
  public val attachment: Attachment? = null,
) : BackboneElement
