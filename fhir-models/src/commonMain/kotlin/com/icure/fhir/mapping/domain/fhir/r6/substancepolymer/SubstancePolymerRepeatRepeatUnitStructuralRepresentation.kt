//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A graphical structure for this SRU
 *
 * A graphical structure for this SRU.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of structure (e.g. Full, Partial, Representative)
 * @param representation The structural representation as text string in a standard format e.g.
 * InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF
 * @param format The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF
 * @param attachment An attached file with the structural representation
 */
@SerialName("SubstancePolymerRepeatRepeatUnitStructuralRepresentation")
@Serializable
public data class SubstancePolymerRepeatRepeatUnitStructuralRepresentation(
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
   * The structural representation as text string in a standard format e.g. InChI, SMILES, MOLFILE,
   * CDX, SDF, PDB, mmCIF
   */
  public val representation: String? = null,
  /**
   * The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF
   */
  public val format: CodeableConcept? = null,
  /**
   * An attached file with the structural representation
   */
  public val attachment: Attachment? = null,
) : BackboneElement
