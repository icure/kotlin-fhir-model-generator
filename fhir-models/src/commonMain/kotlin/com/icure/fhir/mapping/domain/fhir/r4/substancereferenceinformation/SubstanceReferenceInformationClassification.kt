//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancereferenceinformation

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Todo
 *
 * Todo.
 *
 * @param id Unique id for inter-element referencing
 * @param domain Todo
 * @param classification Todo
 */
@SerialName("SubstanceReferenceInformationClassification")
@Serializable
public data class SubstanceReferenceInformationClassification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Todo
   */
  public val domain: CodeableConcept? = null,
  /**
   * Todo
   */
  public val classification: CodeableConcept? = null,
  public val subtype: List<CodeableConcept> = emptyList(),
  public val source: List<Reference> = emptyList(),
) : BackboneElement
