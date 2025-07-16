//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Regulatory information about a medication
 *
 * Regulatory information about a medication.
 *
 * @param id Unique id for inter-element referencing
 * @param regulatoryAuthority Specifies the authority of the regulation
 * @param maxDispense The maximum number of units of the medication that can be dispensed in a
 * period
 */
@SerialName("MedicationKnowledgeRegulatory")
@Serializable
public data class MedicationKnowledgeRegulatory(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specifies the authority of the regulation
   */
  public val regulatoryAuthority: Reference,
  public val substitution: List<MedicationKnowledgeRegulatorySubstitution> = emptyList(),
  public val schedule: List<CodeableConcept> = emptyList(),
  /**
   * The maximum number of units of the medication that can be dispensed in a period
   */
  public val maxDispense: MedicationKnowledgeRegulatoryMaxDispense? = null,
) : BackboneElement
