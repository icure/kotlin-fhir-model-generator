//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicationrequest

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Any restrictions on medication substitution
 *
 * Indicates whether or not substitution can or should be part of the dispense. In some cases,
 * substitution must happen, in other cases substitution must not happen. This block explains the
 * prescriber's intent. If nothing is specified substitution may be done.
 *
 * @param id Unique id for inter-element referencing
 * @param allowedBoolean Whether substitution is allowed or not
 * @param allowedCodeableConcept Whether substitution is allowed or not
 * @param reason Why should (not) substitution be made
 */
@SerialName("MedicationRequestSubstitution")
@Serializable
public data class MedicationRequestSubstitution(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether substitution is allowed or not
   */
  public val allowedBoolean: Boolean? = null,
  /**
   * Whether substitution is allowed or not
   */
  public val allowedCodeableConcept: CodeableConcept? = null,
  /**
   * Why should (not) substitution be made
   */
  public val reason: CodeableConcept? = null,
) : BackboneElement
