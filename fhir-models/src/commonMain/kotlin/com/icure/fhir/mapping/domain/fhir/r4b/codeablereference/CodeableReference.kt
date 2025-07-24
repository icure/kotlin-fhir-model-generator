//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.codeablereference

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Reference to a resource or a concept
 *
 * A reference to a resource (by instance), or instead, a reference to a concept defined in a
 * terminology or ontology (by class).
 *
 * @param id Unique id for inter-element referencing
 * @param concept Reference to a concept (by class)
 * @param reference Reference to a resource (by instance)
 */
@SerialName("CodeableReference")
@Serializable
public data class CodeableReference(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Reference to a concept (by class)
   */
  public val concept: CodeableConcept? = null,
  /**
   * Reference to a resource (by instance)
   */
  public val reference: Reference? = null,
) : Element
