//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.valueset

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Content logical definition of the value set (CLD)
 *
 * A set of criteria that define the contents of the value set by including or excluding codes
 * selected from the specified code system(s) that the value set draws from. This is also known as the
 * Content Logical Definition (CLD).
 *
 * @param id Unique id for inter-element referencing
 * @param lockedDate Fixed date for references with no specified version (transitive)
 * @param inactive Whether inactive codes are in the value set
 */
@SerialName("ValueSetCompose")
@Serializable
public data class ValueSetCompose(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Fixed date for references with no specified version (transitive)
   */
  public val lockedDate: String? = null,
  /**
   * Whether inactive codes are in the value set
   */
  public val inactive: Boolean? = null,
  public val include: List<ValueSetComposeInclude> = emptyList(),
  public val exclude: List<ValueSetComposeInclude> = emptyList(),
) : BackboneElement
