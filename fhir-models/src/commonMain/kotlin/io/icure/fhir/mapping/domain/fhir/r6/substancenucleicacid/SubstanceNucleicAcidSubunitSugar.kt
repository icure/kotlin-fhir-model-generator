//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substancenucleicacid

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 5.3.6.8.1 Sugar ID (Mandatory)
 *
 * 5.3.6.8.1 Sugar ID (Mandatory).
 *
 * @param id Unique id for inter-element referencing
 * @param identifier The Substance ID of the sugar or sugar-like component that make up the
 * nucleotide
 * @param name The name of the sugar or sugar-like component that make up the nucleotide
 * @param residueSite The residues that contain a given sugar will be captured. The order of given
 * residues will be captured in the 5‘-3‘direction consistent with the base sequences listed above
 */
@SerialName("SubstanceNucleicAcidSubunitSugar")
@Serializable
public data class SubstanceNucleicAcidSubunitSugar(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The Substance ID of the sugar or sugar-like component that make up the nucleotide
   */
  public val identifier: Identifier? = null,
  /**
   * The name of the sugar or sugar-like component that make up the nucleotide
   */
  public val name: String? = null,
  /**
   * The residues that contain a given sugar will be captured. The order of given residues will be
   * captured in the 5‘-3‘direction consistent with the base sequences listed above
   */
  public val residueSite: String? = null,
) : BackboneElement
