//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * ValueSet details if this is coded
 *
 * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the
 * data types (string, uri).
 *
 * @param id Unique id for inter-element referencing
 * @param strength required | extensible | preferred | example
 * @param description Human explanation of the value set
 * @param valueSet Source of value set
 */
@SerialName("ElementDefinitionBinding")
@Serializable
public data class ElementDefinitionBinding(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * required | extensible | preferred | example
   */
  public val strength: String? = null,
  /**
   * Human explanation of the value set
   */
  public val description: String? = null,
  /**
   * Source of value set
   */
  public val valueSet: String? = null,
) : Element
