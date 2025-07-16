//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.codeableconcept

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Concept - reference to a terminology or just  text
 *
 * A concept that may be defined by a formal reference to a terminology or ontology or may be
 * provided by text.
 *
 * @param id Unique id for inter-element referencing
 * @param text Plain text representation of the concept
 */
@SerialName("CodeableConcept")
@Serializable
public data class CodeableConcept(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  public val coding: List<Coding> = emptyList(),
  /**
   * Plain text representation of the concept
   */
  public val text: String? = null,
) : Element
