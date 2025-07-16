//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.encounter

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of diagnosis relevant to this encounter
 *
 * The list of diagnosis relevant to this encounter.
 *
 * @param id Unique id for inter-element referencing
 * @param condition The diagnosis or procedure relevant to the encounter
 * @param use Role that this diagnosis has within the encounter (e.g. admission, billing, discharge
 * …)
 * @param rank Ranking of the diagnosis (for each role type)
 */
@SerialName("EncounterDiagnosis")
@Serializable
public data class EncounterDiagnosis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The diagnosis or procedure relevant to the encounter
   */
  public val condition: Reference,
  /**
   * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …)
   */
  public val use: CodeableConcept? = null,
  /**
   * Ranking of the diagnosis (for each role type)
   */
  public val rank: Int? = null,
) : BackboneElement
