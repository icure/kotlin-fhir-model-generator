//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifies if changes are allowed when dispensing a medication from a regulatory perspective
 *
 * Specifies if changes are allowed when dispensing a medication from a regulatory perspective.
 *
 * @param id Unique id for inter-element referencing
 * @param type Specifies the type of substitution allowed
 * @param allowed Specifies if regulation allows for changes in the medication when dispensing
 */
@SerialName("MedicationKnowledgeRegulatorySubstitution")
@Serializable
public data class MedicationKnowledgeRegulatorySubstitution(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specifies the type of substitution allowed
   */
  public val type: CodeableConcept,
  /**
   * Specifies if regulation allows for changes in the medication when dispensing
   */
  public val allowed: Boolean? = null,
) : BackboneElement
