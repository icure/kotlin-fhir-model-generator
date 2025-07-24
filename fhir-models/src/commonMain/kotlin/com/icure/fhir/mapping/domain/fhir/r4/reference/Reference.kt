//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.reference

import com.icure.fhir.mapping.domain.fhir.r4.Element
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A reference from one resource to another
 *
 * A reference from one resource to another.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Literal reference, Relative, internal or absolute URL
 * @param type Type the reference refers to (e.g. "Patient")
 * @param identifier Logical reference, when literal reference is not known
 * @param display Text alternative for the resource
 */
@SerialName("Reference")
@Serializable
public data class Reference(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Literal reference, Relative, internal or absolute URL
   */
  public val reference: String? = null,
  /**
   * Type the reference refers to (e.g. "Patient")
   */
  public val type: String? = null,
  /**
   * Logical reference, when literal reference is not known
   */
  public val identifier: Identifier? = null,
  /**
   * Text alternative for the resource
   */
  public val display: String? = null,
) : Element
