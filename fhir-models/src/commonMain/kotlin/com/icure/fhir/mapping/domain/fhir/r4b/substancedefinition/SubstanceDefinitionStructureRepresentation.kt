//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A depiction of the structure or characterization of the substance
 *
 * A depiction of the structure or characterization of the substance.
 *
 * @param id Unique id for inter-element referencing
 * @param type The kind of structural representation (e.g. full, partial)
 * @param representation The structural representation or characterization as a text string in a
 * standard format
 * @param format The format of the representation e.g. InChI, SMILES, MOLFILE (note: not the
 * physical file format)
 * @param document An attachment with the structural representation e.g. a structure graphic or
 * AnIML file
 */
@SerialName("SubstanceDefinitionStructureRepresentation")
@Serializable
public data class SubstanceDefinitionStructureRepresentation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The kind of structural representation (e.g. full, partial)
   */
  public val type: CodeableConcept? = null,
  /**
   * The structural representation or characterization as a text string in a standard format
   */
  public val representation: String? = null,
  /**
   * The format of the representation e.g. InChI, SMILES, MOLFILE (note: not the physical file
   * format)
   */
  public val format: CodeableConcept? = null,
  /**
   * An attachment with the structural representation e.g. a structure graphic or AnIML file
   */
  public val document: Reference? = null,
) : BackboneElement
