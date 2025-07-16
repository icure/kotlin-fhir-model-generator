//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.auditevent

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional Information about the entity
 *
 * Tagged value pairs for conveying additional information about the entity.
 *
 * @param id Unique id for inter-element referencing
 * @param type Name of the property
 * @param valueString Property value
 * @param valueBase64Binary Property value
 */
@SerialName("AuditEventEntityDetail")
@Serializable
public data class AuditEventEntityDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of the property
   */
  public val type: String? = null,
  /**
   * Property value
   */
  public val valueString: String? = null,
  /**
   * Property value
   */
  public val valueBase64Binary: String? = null,
) : BackboneElement
