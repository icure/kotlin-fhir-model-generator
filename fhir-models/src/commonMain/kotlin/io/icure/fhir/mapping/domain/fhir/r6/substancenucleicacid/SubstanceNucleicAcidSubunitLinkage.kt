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
 * The linkages between sugar residues will also be captured
 *
 * The linkages between sugar residues will also be captured.
 *
 * @param id Unique id for inter-element referencing
 * @param connectivity The entity that links the sugar residues together should also be captured for
 * nearly all naturally occurring nucleic acid the linkage is a phosphate group. For many synthetic
 * oligonucleotides phosphorothioate linkages are often seen. Linkage connectivity is assumed to be
 * 3’-5’. If the linkage is either 3’-3’ or 5’-5’ this should be specified
 * @param identifier Each linkage will be registered as a fragment and have an ID
 * @param name Each linkage will be registered as a fragment and have at least one name. A single
 * name shall be assigned to each linkage
 * @param residueSite Residues shall be captured as described in 5.3.6.8.3
 */
@SerialName("SubstanceNucleicAcidSubunitLinkage")
@Serializable
public data class SubstanceNucleicAcidSubunitLinkage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The entity that links the sugar residues together should also be captured for nearly all
   * naturally occurring nucleic acid the linkage is a phosphate group. For many synthetic
   * oligonucleotides phosphorothioate linkages are often seen. Linkage connectivity is assumed to be
   * 3’-5’. If the linkage is either 3’-3’ or 5’-5’ this should be specified
   */
  public val connectivity: String? = null,
  /**
   * Each linkage will be registered as a fragment and have an ID
   */
  public val identifier: Identifier? = null,
  /**
   * Each linkage will be registered as a fragment and have at least one name. A single name shall
   * be assigned to each linkage
   */
  public val name: String? = null,
  /**
   * Residues shall be captured as described in 5.3.6.8.3
   */
  public val residueSite: String? = null,
) : BackboneElement
